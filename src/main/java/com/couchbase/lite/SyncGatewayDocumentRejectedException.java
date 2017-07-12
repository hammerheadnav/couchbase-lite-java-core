package com.couchbase.lite;


public class SyncGatewayDocumentRejectedException extends Exception {
    private String message;

    public SyncGatewayDocumentRejectedException(String message) {
        this.message = message;
    }

    public int getCode() {
        return Status.FORBIDDEN;
    }

    public String getMessage() {
        return message;
    }
}
