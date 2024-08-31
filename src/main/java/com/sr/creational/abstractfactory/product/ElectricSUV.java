package com.sr.creational.abstractfactory.product;

public class ElectricSUV extends Automobile {
    @Override
    public void assemble() {
        System.out.println("Assembling the electric SUV.");
    }

    @Override
    public void paint() {
        System.out.println("Painting the electric SUV.");
    }
}