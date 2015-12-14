package com.clouway.observertask;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Adder implements Subject{
    private final ProductChangeListener productChangeListener;

    public Adder(ProductChangeListener productChangeListener) {
        this.productChangeListener = productChangeListener;
    }

    public void registeredProduct(Product product){
        notifyObserver(product);
    }

    @Override
    public void notifyObserver(Product product) {
        productChangeListener.onProductRegistered(product);
    }
}
