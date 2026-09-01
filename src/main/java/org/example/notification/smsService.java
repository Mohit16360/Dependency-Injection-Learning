package org.example.notification;

public class smsService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("SMS Notification Send");
    }

}
