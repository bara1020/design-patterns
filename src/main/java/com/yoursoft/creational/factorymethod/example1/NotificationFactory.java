package com.yoursoft.creational.factorymethod.example1;

public class NotificationFactory {

    public Notification createNotification(String channel){
        if(channel.isBlank()){
            return null;
        }

        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
