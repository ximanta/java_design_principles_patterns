package com.sr.creational.abstractfactory.factory;

import com.sr.creational.abstractfactory.product.Automobile;

public interface AutomobileFactory {

    Automobile createSedan();
    Automobile createSUV();


}
