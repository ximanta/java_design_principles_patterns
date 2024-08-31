package com.sr.creational.builder.builder;

public class PaymentTransactionBuilder implements TransactionBuilder {
    protected String payerAccount;
    protected String recipientAccount;
    protected String currency;
    protected double amount;
    protected String paymentMethod;
    protected double transactionFee;
    protected String transactionDescription;

    public PaymentTransactionBuilder(String payerAccount, String recipientAccount) {
        this.payerAccount = payerAccount;
        this.recipientAccount = recipientAccount;
    }

    @Override
    public TransactionBuilder withAmount(double amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public TransactionBuilder withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public TransactionBuilder withPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    @Override
    public TransactionBuilder withTransactionFee(double fee) {
        this.transactionFee = fee;
        return this;
    }
    @Override
    public TransactionBuilder withDescription(String description) {
        this.transactionDescription = description;
        return this;
    }
    @Override
    public PaymentTransaction build() {
        return new PaymentTransaction(this);
    }
}
