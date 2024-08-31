package com.sr.creational.facorymethod.client;

import com.sr.creational.facorymethod.creator.NotificationFactory;
import com.sr.creational.facorymethod.creator.AppNotificationFactory;
import com.sr.creational.facorymethod.creator.EmailNotificationFactory;
import com.sr.creational.facorymethod.product.Notification;

public class ClientWithFactory {

    public static void main(String[] args) {

        /***

        Deferring Instantiation: The client code doesn't need to know the details of
         the specific Notification subclass being instantiated.
         It simply interacts with the NotificationFactory interface,
         and the actual instantiation logic is deferred to the subclass implementing the factory.
       ***/
        NotificationFactory emailNotificationCreator= new EmailNotificationFactory();
        Notification emailNotification = emailNotificationCreator.createNotification();

        NotificationFactory appNotificationCreator = new AppNotificationFactory();
        Notification appNotification = appNotificationCreator.createNotification();

    }
}
