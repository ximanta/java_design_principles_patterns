package com.sr.solid.ocp;

public class Customer {
    private String name;
    private int age;
    private Claim claim;

    public Customer(String name, int age, Claim claim) {
        this.name = name;
        this.age = age;
        this.claim = claim;
    }
    public String getName() {
        return name;
    }
     public int getAge() {
        return age;
    }
    public Claim getClaim() {
        return claim;
    }

}
