package com.thoughtworks.ddd_workshop.domain.bank;

public class Account {
    Address address;

    public void updateAddress(Address address)
    {
        this.address = address;
        System.out.println("Account Address updated: " + address.city);
    }
}
