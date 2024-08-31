package com.sr.creational.facorymethod.product;

public class EmailNotification extends Notification {
    @Override
    public void compose() {
        System.out.println("Composing notification for Email.");
    }

}