package com.sr.creational.abstractfactory.factory;

import com.sr.creational.abstractfactory.product.Automobile;
import com.sr.creational.abstractfactory.product.GasolineSUV;
import com.sr.creational.abstractfactory.product.GasolineSedan;

public class GasolineAutomobileCompany implements AutomobileFactory {

    @Override
    public Automobile createSedan() {
        Automobile gasSedan = new GasolineSedan();
        gasSedan.assemble();
        gasSedan.paint();
        return gasSedan;
    }

    @Override
    public Automobile createSUV() {
        Automobile gasSUV = new GasolineSUV();
        gasSUV.assemble();
        gasSUV.paint();
        return gasSUV;
    }

 }
