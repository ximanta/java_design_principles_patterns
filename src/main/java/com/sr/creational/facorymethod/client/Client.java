package com.sr.creational.facorymethod.client;

import com.sr.creational.facorymethod.product.AppNotification;
import com.sr.creational.facorymethod.product.EmailNotification;
import com.sr.creational.facorymethod.product.Notification;

public class Client {
    public static void main(String[] args) {
        Notification emailNotification= new EmailNotification();
        emailNotification.compose();

        Notification appNotification= new AppNotification();
        appNotification.compose();
    }
}
