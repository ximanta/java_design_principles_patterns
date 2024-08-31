package com.sr.solid.ocp;

import java.math.BigDecimal;
public class Claim {
    private String claimId;
    private BigDecimal amount;

    public Claim(String claimId, BigDecimal amount) {
        this.claimId = claimId;
        this.amount = amount;

    }
    public String getClaimId() {
        return claimId;
    }

    public BigDecimal getAmount() {
        return amount;
    }


}
