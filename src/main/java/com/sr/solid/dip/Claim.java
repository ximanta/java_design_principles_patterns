package com.sr.solid.dip;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Claim {
    private final String claimId;
    private final BigDecimal amount;
}
