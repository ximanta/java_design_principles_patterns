package com.sr.creational.abstractfactory.factory;

import com.sr.creational.abstractfactory.product.Automobile;
import com.sr.creational.abstractfactory.product.ElectricSUV;
import com.sr.creational.abstractfactory.product.ElectricSedan;

public class ElectricAutomobileFactory implements AutomobileFactory {
    @Override
    public Automobile createSedan() {
        Automobile electricSedan= new ElectricSedan();
        electricSedan.assemble();
        electricSedan.paint();
        return electricSedan;
    }

    @Override
    public Automobile createSUV() {
        Automobile electricSUV = new ElectricSUV();
        electricSUV.assemble();
        electricSUV.paint();
        return electricSUV;
    }
}
