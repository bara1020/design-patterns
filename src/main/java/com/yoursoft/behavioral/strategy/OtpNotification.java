package com.yoursoft.behavioral.strategy;

public class OtpNotification {

    private String otpCode;

    public String getOtpCode() {
        return otpCode;
    }

    public void setOtpCode(String otpCode) {
        this.otpCode = otpCode;
    }

    public void sendOtp(OtpNotificationStrategy otpNotificationStrategy){
        otpNotificationStrategy.sendNotification(otpCode);

    }

}
