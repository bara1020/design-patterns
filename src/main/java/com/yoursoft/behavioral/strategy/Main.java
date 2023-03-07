package com.yoursoft.behavioral.strategy;

import java.util.Date;

public class Main {

    public static final String OTP_CODE = "1234";
    public static final String TO = "to@email.com";
    public static final String MESSAGE = "message";
    public static final String TO_NUMBER = "3200000";
    public static final String NAME = "Pedro";
    public static final String LAST_NAME = "León";

    public static void main(String[] args) {

        Customer customer = new Customer(NAME, LAST_NAME);

        OtpNotification otpNotification = new OtpNotification();
        otpNotification.setOtpCode(OTP_CODE);

        otpNotification.sendOtp(new EmailNotificationStrategy(TO, MESSAGE, new Date()));
        otpNotification.sendOtp(new SmsNotificationStrategy(TO_NUMBER, MESSAGE, new Date()));


    }
}
