package com.sr.creational.facorymethod.creator;


import com.sr.creational.facorymethod.product.Notification;

/**
 * The NotificationFactory class defines the factory method create(),
 * which is an abstract method that must be implemented by subclasses.
 */
public abstract class NotificationFactory {

        public Notification createNotification() {
                Notification notification = create();
                notification.compose();
                return notification;
        }
        protected abstract Notification create();//Factory Method
}
