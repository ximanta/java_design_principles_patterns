package com.sr.creational.builder.builder;

public class PaymentTransaction {
    private String payerAccount;
    private String recipientAccount;
    private String currency;
    private double amount;
    private String paymentMethod;
    private double transactionFee;

    private String transactionDescription;
    protected PaymentTransaction(PaymentTransactionBuilder builder) {
        this.payerAccount = builder.payerAccount;
        this.recipientAccount = builder.recipientAccount;
        this.currency = builder.currency;
        this.amount = builder.amount;
        this.paymentMethod = builder.paymentMethod;
        this.transactionFee = builder.transactionFee;
        this.transactionDescription = builder.transactionDescritpion;
    }

    @Override
    public String toString() {
        return "PaymentTransaction{" +
                "payerAccount='" + payerAccount + '\'' +
                ", recipientAccount='" + recipientAccount + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", transactionFee=" + transactionFee +
                ", transactionDescription='" + transactionDescription + '\'' +
                '}';
    }
}
