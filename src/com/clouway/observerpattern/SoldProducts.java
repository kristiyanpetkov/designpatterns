package com.clouway.observerpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by clouway on 16-2-8.
 */
public class SoldProducts implements ProductChangeListener {

    private Map<Product, Integer> soldProducts = new HashMap<Product, Integer>();

    @Override
    public void sellProduct(Product product) {
        if (soldProducts.containsKey(product)) {
            soldProducts.put(product, soldProducts.get(product) + 1);
        } else {
            soldProducts.put(product, 1);
        }
    }

    @Override
    public void addProduct(Product product) {
        
    }

    public Map<Product, Integer> getSoldProducts() {
        return soldProducts;
    }
}
