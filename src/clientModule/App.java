package clientModule;

import javax.swing.*;
import clientModule.forms.StartMenuForm.*;

public class App {
    public static final JFrame mainFrame = new JFrame("SpaceMarine");

    public static void main(String[] args) {
        Client client = new Client("localhost", 20002);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 400);
        mainFrame.setContentPane(new StartMenu(mainFrame, client).getStartMenuPanel());
        mainFrame.setVisible(true);
    }
}

