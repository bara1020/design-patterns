package com.yoursoft.creational.factorymethod.example1;

public class EmailNotification implements Notification{


    @Override
    public void notifyUser() {
        System.out.println("Sending EMAIL Notification");
    }
}
