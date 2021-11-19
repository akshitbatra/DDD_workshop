package com.thoughtworks.ddd_workshop.domain;

import java.util.Currency;

public class Price {
    double productPrice;
    Currency currency;

    public Price(double productPrice, String currency) {
        this.productPrice = productPrice;
        this.currency = Currency.getInstance(currency);
    }

    public double getProductPrice() {
        return productPrice;
    }
}
