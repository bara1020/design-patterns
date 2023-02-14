package com.yoursoft.structural.facade.domain;

import java.util.Date;

public class HeaderMessage {

    private String messageId;
    private Date processDate;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }
}
