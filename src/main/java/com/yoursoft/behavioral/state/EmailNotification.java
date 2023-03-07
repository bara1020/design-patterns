package com.yoursoft.behavioral.state;

public class EmailNotification implements NotificationState{
    @Override
    public void notification(NotificationContext notificationContext) {
        System.out.println("Notification sent by email");
    }
}
