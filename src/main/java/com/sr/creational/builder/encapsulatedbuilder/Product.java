package com.sr.creational.builder.encapsulatedbuilder;

public class Product {

    private String name;
    private double price;

    private String description;

    public Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
    }
@Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
    public static class ProductBuilder {

        private String name;
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
