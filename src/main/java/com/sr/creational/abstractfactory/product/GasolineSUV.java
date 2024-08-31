package com.sr.creational.abstractfactory.product;

public class GasolineSUV extends Automobile{

    @Override
    public void assemble() {
        System.out.println("Assembling the Gasoline SUV");
    }

    @Override
    public void paint() {
        System.out.println("Painting the Gasoline SUV");
    }
}
