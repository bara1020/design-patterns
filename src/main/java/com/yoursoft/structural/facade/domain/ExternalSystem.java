package com.yoursoft.structural.facade.domain;

public class ExternalSystem {

    private HeaderMessage headerMessage;
    private BodyMessage bodyMessage;

    public HeaderMessage getHeaderMessage() {
        return headerMessage;
    }

    public void setHeaderMessage(HeaderMessage headerMessage) {
        this.headerMessage = headerMessage;
    }

    public BodyMessage getBodyMessage() {
        return bodyMessage;
    }

    public void setBodyMessage(BodyMessage bodyMessage) {
        this.bodyMessage = bodyMessage;
    }

    @Override
    public String toString() {
        return "ExternalSystem{" + "headerMessage=" + headerMessage + ", bodyMessage=" + bodyMessage + '}';
    }
}
