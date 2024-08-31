package com.sr.creational.abstractfactory.product;

public class GasolineSedan extends Automobile{

    @Override
    public void assemble() {
        System.out.println("Assembling a Gasoline Sedan");
    }

    @Override
    public void paint() {
        System.out.println("Painting the Gasoline Sedan");
    }
}
