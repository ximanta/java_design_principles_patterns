package com.sr.creational.builder.encapsulatedbuilder;

import lombok.ToString;

@ToString
public class Product {

    private final String name;
    private final double price;
    private final String description;

    public Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
    }

    public static class ProductBuilder {

        private final String name;
        private double price;
        private String description;

        public ProductBuilder(String name){
            this.name = name;
        }

        public ProductBuilder withPrice(double price){
            this.price = price;
            return this;
        }

        public ProductBuilder withDescription(String description){
            this.description = description;
            return this;
        }

        public Product build(){
            return new Product(this);
        }
    }
}
