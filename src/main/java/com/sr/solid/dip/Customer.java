package com.sr.solid.dip;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Customer {
    private final String name;
    private final int age;
    private final Claim claim;
}
