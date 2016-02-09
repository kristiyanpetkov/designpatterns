package com.clouway.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clouway on 16-2-8.
 */
public class ProductsRepository implements ProductChangeListener {
   private List<Product> avaibleProducts = new ArrayList<Product>();

    @Override
    public void addProduct(Product product) {
        avaibleProducts.add(product);
    }

    @Override
    public void sellProduct(Product product) {
        avaibleProducts.remove(product);
    }

    public List<Product> getAvaibleProducts(){
        return avaibleProducts;
    }
}
