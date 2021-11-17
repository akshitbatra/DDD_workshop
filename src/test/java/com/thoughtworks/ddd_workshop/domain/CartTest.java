package com.thoughtworks.ddd_workshop.domain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CartTest {
    @Test
    public void itemAdded(){
        Cart cart = new Cart();
//        Item item = new Item("Hero Ink Pen", 1);
//        cart.addItem(item);
        assertEquals(cart.items.size(), 1);
    }
}