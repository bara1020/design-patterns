package com.yoursoft.behavioral.state;

public class Main {

    public static void main(String[] args) {

        NotificationContext stateContext
                = new NotificationContext();

        stateContext.notification();
        stateContext.notification();
        stateContext.setNotificationState(new SmsNotification());
        stateContext.notification();
        stateContext.notification();
    }
}
