package com.yoursoft.creational.factorymethod.example1;

public class SMSNotification implements Notification{


    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}
