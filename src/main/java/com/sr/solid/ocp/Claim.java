package com.sr.solid.ocp;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Claim {
    private final String claimId;
    private final BigDecimal amount;
}
