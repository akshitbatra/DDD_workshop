package com.thoughtworks.ddd_workshop.domain;

import java.util.HashMap;

public class Product {
    String name;
    double weight;
    Price price;

    public Product(String name, Price price) {
        this.name = name;
        this.price = price;
    }
}
