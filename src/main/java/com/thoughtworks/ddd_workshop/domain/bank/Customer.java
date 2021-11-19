package com.thoughtworks.ddd_workshop.domain.bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    List<Account> listOfAccounts = new ArrayList<Account>();
    Address address;

    public Customer() {
        Account account = new Account();
        listOfAccounts.add(account);
        Account account2 = new Account();
        listOfAccounts.add(account2);
    }


    public void updateAddress(Address address){
        this.address = address;
        System.out.println("Address updated: " + address.city);

        for(Account account: listOfAccounts)
        {
            account.updateAddress(address);
        }
    }
}
