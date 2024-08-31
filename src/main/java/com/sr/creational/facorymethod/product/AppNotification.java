package com.sr.creational.facorymethod.product;

public class AppNotification extends Notification {
    @Override
    public void compose() {
        System.out.println("Composing notification for App.");
    }
}