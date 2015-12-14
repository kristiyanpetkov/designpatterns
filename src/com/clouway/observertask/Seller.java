package com.clouway.observertask;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Seller {
    private final ProductChangeListener productChangeListener;

    public Seller(ProductChangeListener productChangeListener) {
        this.productChangeListener = productChangeListener;
    }

    public void sellProduct(Product product){
        productChangeListener.onProductSold(product);
    }
}
