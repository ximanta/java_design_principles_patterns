package com.sr.creational.builder.client;

import com.sr.creational.builder.builder.PaymentTransaction;
import com.sr.creational.builder.builder.PaymentTransactionBuilder;
import com.sr.creational.builder.builder.TransactionBuilder;

public class TransactionClient {
    public static void main(String[] args) {
        PaymentTransaction transaction = getPaymentTransaction();
        System.out.println(transaction);
    }

    private static PaymentTransaction getPaymentTransaction() {
        return new PaymentTransactionBuilder("Payer123", "Recipient456")
                 .withAmount(1500.75)
                 .withCurrency("USD")
                 .withPaymentMethod("Credit Card")
                 .withTransactionFee(15.00)
                 .withDescription("Food Purchase")
                 .build();
    }
}