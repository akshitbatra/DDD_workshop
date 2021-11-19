package com.thoughtworks.ddd_workshop.domain;

import java.util.ArrayList;

public class Order {

    double costOfAllProducts = 0;

    public double totalCost(double weight){
        return costOfAllProducts + weight;
    }

    public void createOrder(ArrayList<Item> items) {

        double totalWeight = 0;

        for(Item item: items)
        {
            costOfAllProducts += (item.quantity * item.product.price.productPrice);
            totalWeight += (item.product.weight * 0.01);
        }

        System.out.println("Total Cost: " + totalCost(totalWeight));
    }
}
