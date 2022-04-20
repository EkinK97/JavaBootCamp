package com.company;

import java.util.ArrayList;
import java.util.List;

public class storeProducts {
    private final List<Product> products = new ArrayList<Product>();

    public storeProducts () {
        this.initStoreItems(); //generic collection
    }

    public List<Product> getProducts() {
        return products;
    }

    public void initStoreItems() {
        String [] seller = {"ekin","ekin1","ekin2","ekin3","ekin4"};
        String [] productNames = {"Boiler", "Heater", "Cooler", "Playstation"};
        Integer [] quantity = {10, 6, 11, 20};
        Double [] productPrice = {40.00d, 60.00d, 3000.00d, 1000.00d };

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, seller[i], productNames[i],quantity[i], productPrice[i]));

        }
    }
}
