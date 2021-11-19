package com.thoughtworks.ddd_workshop.domain.domain_service;

import com.thoughtworks.ddd_workshop.domain.Price;

import java.util.HashMap;

public class CompetitorBasedPricing {
    private HashMap<String, Price> competitorPriceList = new HashMap<String, Price>();

    public CompetitorBasedPricing()
    {competitorProducts();}

    public void competitorProducts(){
        competitorPriceList.put("Ipad Pro", new Price(11000.0, "INR"));
        competitorPriceList.put("Hero Ink Pen", new Price(11.0, "INR"));
        competitorPriceList.put("GM Cricket Bat", new Price(1100.0, "INR"));
    }

    public double calculateDiscountPrice(double discount, String productName)
    {
        double productPrice = competitorPriceList.get(productName).getProductPrice();
        return productPrice - (productPrice * discount/100);
    }
}
