package com.yoursoft.behavioral.strategy;

import java.util.Date;

public class EmailNotificationStrategy implements OtpNotificationStrategy{

    private String to;
    private String message;
    private Date date;

    public EmailNotificationStrategy(String to, String message, Date date) {
        this.to = to;
        this.message = message;
        this.date = date;
    }

    @Override
    public void sendNotification(String otpCode) {
        System.out.println("The OTP code was send by email");
    }
}
