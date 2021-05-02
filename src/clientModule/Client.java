package clientModule;

import clientModule.utility.AuthManager;
import clientModule.utility.Console;
import common.utility.Request;
import common.utility.Response;
import common.utility.ResponseCode;
import common.utility.User;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Set;

public class Client {
    private String host;
    private int port;
    private User user;

    private DatagramChannel datagramChannel;
    private SocketAddress address;
    private ByteBuffer byteBuffer = ByteBuffer.allocate(16384);
    private Selector selector;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Client(String host, int port){
        this.host = host;
        this.port = port;
        try {
            startClient();
        } catch (IOException exception) {
            System.out.println("Произошла ошибка при работе с сервером!");
            System.exit(0);
        }
    }

    private void startClient() throws IOException {
        datagramChannel = DatagramChannel.open();
        address = new InetSocketAddress(this.host, this.port);
        datagramChannel.connect(address);
        datagramChannel.configureBlocking(false);
        selector = Selector.open();
        datagramChannel.register(selector, SelectionKey.OP_WRITE);
    }

    private void makeByteBufferToRequest(Request request) throws IOException {
        byteBuffer.put(serialize(request));
        byteBuffer.flip();
    }

    private byte[] serialize(Request request) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(request);
        byte[] buffer = byteArrayOutputStream.toByteArray();
        objectOutputStream.flush();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        objectOutputStream.close();
        return buffer;
    }

    private Response deserialize() throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteBuffer.array());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Response response = (Response) objectInputStream.readObject();
        byteArrayInputStream.close();
        objectInputStream.close();
        byteBuffer.clear();
        return response;
    }

    public void send(Request request) throws IOException {
        makeByteBufferToRequest(request);
        DatagramChannel channel = null;
        while (channel == null) {
            selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            for (SelectionKey key : selectionKeys) {
                if (key.isWritable()) {
                    channel = (DatagramChannel) key.channel();
                    channel.write(byteBuffer);
                    channel.register(selector, SelectionKey.OP_READ);
                    break;
                }
            }
        }
        byteBuffer.clear();
    }

    public Response receive() throws IOException, ClassNotFoundException {
        DatagramChannel channel = null;
        while (channel == null) {
            selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            for (SelectionKey key : selectionKeys) {
                if (key.isReadable()) {
                    channel = (DatagramChannel) key.channel();
                    channel.read(byteBuffer);
                    byteBuffer.flip();
                    channel.register(selector, SelectionKey.OP_WRITE);
                    break;
                }
            }
        }
        return deserialize();
    }
}
