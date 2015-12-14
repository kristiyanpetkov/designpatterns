package com.clouway.observertask;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class ProductInventory implements ProductChangeListener {
    private List<Product> soldProducts = new LinkedList<>();
    private List<Product> registeredProducts = new LinkedList<>();

    @Override
    public void onProductSold(Product product) {
        soldProducts.add(product);
    }

    @Override
    public void onProductRegistered(Product product) {
        registeredProducts.add(product);
    }
}
