package com.clouway.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clouway on 16-2-8.
 */
public class SoldProducts implements ProductChangeListener {

    private List<Product> soldProducts = new ArrayList<Product>();

    @Override
    public void sellProduct(Product product) {
        soldProducts.add(product);
    }

    @Override
    public void addProduct(Product product) {
    soldProducts.remove(product);
    }

    public List<Product> getSoldProducts(){
        return soldProducts;
    }
}
