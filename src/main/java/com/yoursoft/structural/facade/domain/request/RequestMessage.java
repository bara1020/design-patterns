package com.yoursoft.structural.facade.domain.request;

public class RequestMessage {
    private String messageId;
    private String email;
    private String message;
    private String systemId;

    public RequestMessage(String messageId, String email, String message,
            String systemId) {
        this.messageId = messageId;
        this.email = email;
        this.message = message;
        this.systemId = systemId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}
