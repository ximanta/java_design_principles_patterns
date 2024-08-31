package com.sr.creational.builder.encapsulatedbuilder;

public class ProductClient {

    public static void main(String[] args) {
        Product product = new Product.ProductBuilder("Laptop")
                .withPrice(1200)
                .withDescription("HP")
                .build();
        System.out.println(product);
    }
}
