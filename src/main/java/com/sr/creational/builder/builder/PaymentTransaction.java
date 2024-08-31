package com.sr.creational.builder.builder;

import lombok.ToString;

@ToString
public class PaymentTransaction {
    private final String payerAccount;
    private final String recipientAccount;
    private final String currency;
    private final double amount;
    private final String paymentMethod;
    private final double transactionFee;
    private final String transactionDescription;

    protected PaymentTransaction(PaymentTransactionBuilder builder) {
        this.payerAccount = builder.payerAccount;
        this.recipientAccount = builder.recipientAccount;
        this.currency = builder.currency;
        this.amount = builder.amount;
        this.paymentMethod = builder.paymentMethod;
        this.transactionFee = builder.transactionFee;
        this.transactionDescription = builder.transactionDescription;
    }
}
