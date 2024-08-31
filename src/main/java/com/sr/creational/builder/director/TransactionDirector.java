package com.sr.creational.builder.director;

import com.sr.creational.builder.builder.PaymentTransaction;
import com.sr.creational.builder.builder.TransactionBuilder;

public class TransactionDirector {

        private TransactionBuilder builder;

        public TransactionDirector(TransactionBuilder builder) {
            this.builder = builder;
        }

        public PaymentTransaction constructStandardTransaction() {
            return builder
                    .withAmount(1000)
                    .withCurrency("USD")
                    .withPaymentMethod("Credit Card")
                    .withTransactionFee(10)
                    .build();
        }
    }


