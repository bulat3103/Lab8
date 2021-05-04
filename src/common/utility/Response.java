package common.utility;

import common.data.SpaceMarine;

import java.io.Serializable;
import java.util.TreeMap;

public class Response implements Serializable {
    private ResponseCode responseCode;
    private String responseBody;
    private TreeMap<Integer, SpaceMarine> collection;

    public Response(ResponseCode responseCode, String responseBody, TreeMap<Integer, SpaceMarine> collection) {
        this.responseCode = responseCode;
        this.responseBody = responseBody;
        this.collection = collection;
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public TreeMap<Integer, SpaceMarine> getCollection() {
        return collection;
    }
}
