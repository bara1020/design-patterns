package com.yoursoft.behavioral.state;

public class NotificationContext {
    private NotificationState notificationState;

    public NotificationContext(){
        notificationState = new EmailNotification();
    }

    public void notification() {
         notificationState.notification(this);
    }

    public void setNotificationState(NotificationState notificationState) {
        this.notificationState = notificationState;
    }
}
