package com.sr.creational.abstractfactory.client;

import com.sr.creational.abstractfactory.factory.AutomobileFactory;
import com.sr.creational.abstractfactory.factory.ElectricAutomobileFactory;
import com.sr.creational.abstractfactory.factory.GasolineAutomobileCompany;
import com.sr.creational.abstractfactory.product.Automobile;

public class AutomobileClient {

    public static void main(String[] args) {
    System.out.println("Calling Electric Factory....\n");
    AutomobileFactory electricFactory = new ElectricAutomobileFactory();
    Automobile electricSedan = electricFactory.createSedan();
    Automobile electricSUV = electricFactory.createSUV();
    System.out.println("\nCalling Gasoline Factory....\n");
    AutomobileFactory gasolineFactory = new GasolineAutomobileCompany();
    Automobile gasolineSedan = gasolineFactory.createSedan();
    Automobile gasolineSUV = gasolineFactory.createSUV();
}
}
