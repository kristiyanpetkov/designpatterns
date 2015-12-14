package com.clouway.observertask;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class ConsoleDisplay implements ProductChangeListener {
    @Override
    public void onProductSold(Product product) {
        System.out.println(String.format("Product '%s' sold.", product.getProductName()));
    }

    @Override
    public void onProductRegistered(Product product) {
        System.out.println(String.format("Product '%s' was registered.", product.getProductName()));

    }
}
