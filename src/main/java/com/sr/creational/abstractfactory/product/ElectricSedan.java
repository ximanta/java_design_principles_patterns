package com.sr.creational.abstractfactory.product;

public class ElectricSedan extends Automobile {
    @Override
    public void assemble() {
        System.out.println("Assembling the electric Sedan.");
    }
    @Override
    public void paint() {
        System.out.println("Painting the electric Sedan.");
    }
}