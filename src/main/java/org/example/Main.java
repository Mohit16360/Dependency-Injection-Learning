package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.popUpNotification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notification = new popUpNotification();
        OrderService order = new OrderService(notification);
        order.placeOder();

    }
}