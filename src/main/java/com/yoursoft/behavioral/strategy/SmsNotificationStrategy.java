package com.yoursoft.behavioral.strategy;

import java.util.Date;

public class SmsNotificationStrategy implements OtpNotificationStrategy{

    private String number;
    private String message;
    private Date date;

    public SmsNotificationStrategy(String number, String message, Date date) {
        this.number = number;
        this.message = message;
        this.date = date;
    }

    @Override
    public void sendNotification(String otpCode) {
        System.out.println("The OTP code was send by sms");
    }
}
