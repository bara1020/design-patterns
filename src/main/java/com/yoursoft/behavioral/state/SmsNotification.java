package com.yoursoft.behavioral.state;

public class SmsNotification  implements NotificationState{
    @Override
    public void notification(NotificationContext notificationContext) {
        System.out.println("Notification sent by sms");
    }
}
