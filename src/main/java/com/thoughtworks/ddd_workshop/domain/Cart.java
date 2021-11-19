package com.thoughtworks.ddd_workshop.domain;

import java.util.ArrayList;

public class Cart {

    ArrayList<Item> items = new ArrayList<>();
    ArrayList<String> removedItems = new ArrayList<String>();
    boolean checkout = false;

    public void cartCheckout() {
        Order order = new Order();
        try{
            order.createOrder(items);
            checkout = true;
        }
        catch (Exception e){
            checkout = false;
        }
        System.out.println("Cart Checkout");
    }
    public void addItem(Item item)
    {
        items.add(item);
        System.out.println("Item added: " + item.product.name + " Quantity: " + item.quantity);
    }

    public void removeItem(Item item)
    {
        if(item != null)
        {
            items.remove(item);
            System.out.println("Item removed: " + item.product.name + " Quantity: " + item.quantity);

            if(!removedItems.contains(item.product.name))
                removedItems.add(item.product.name);
        }
    }

    public void removedItemsList()
    {
        System.out.println("Removed Items:");
        for(String productName: removedItems)
        {
            System.out.println(productName);
        }
    }
    public Item getItem(String name) {
        for(Item item : items)
        {
            if(item.product.name.equals(name))
                return item;
        }
        return null;
    }
}
