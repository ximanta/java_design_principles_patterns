package com.sr.solid.dip;

public class EmailNotifier {

    public void notifyCustomer(boolean status) {
        if(status) {
            System.out.println("Claim Approved Status: "+status+" Customer is notified via Email");
        }
        else
            System.out.println("Claim Approved Status: "+status+" Customer is notified via Email");
    }
}

