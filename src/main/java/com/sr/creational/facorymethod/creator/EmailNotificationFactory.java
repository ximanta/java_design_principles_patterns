package com.sr.creational.facorymethod.creator;

import com.sr.creational.facorymethod.product.EmailNotification;
import com.sr.creational.facorymethod.product.Notification;


/** Subclasses Decide Which Class to Instantiate:
 * Each concrete factory class (EmailNotificationFactory, AppNotificationFactory provides the implementation of the create() method,
 * deciding which specific type of Notification to instantiate.
 *
 */
public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification create() {
        return new EmailNotification();
    }
}