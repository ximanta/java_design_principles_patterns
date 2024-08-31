package com.sr.creational.facorymethod.creator;

import com.sr.creational.facorymethod.product.AppNotification;
import com.sr.creational.facorymethod.product.Notification;

public class AppNotificationFactory extends NotificationFactory {
    @Override
    public Notification create() {
        return new AppNotification();
    }
}
