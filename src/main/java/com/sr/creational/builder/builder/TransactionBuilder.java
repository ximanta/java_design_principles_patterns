package com.sr.creational.builder.builder;

public interface TransactionBuilder {
        TransactionBuilder withAmount(double amount);
        TransactionBuilder withCurrency(String currency);
        TransactionBuilder withPaymentMethod(String paymentMethod);
        TransactionBuilder withTransactionFee(double fee);
        TransactionBuilder withDescription(String description);
        PaymentTransaction build();
    }

