package com.clouway.observertask;

/**
 * ProductChangeListener is a listener interface which is used for notification of product event.
 *
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public interface ProductChangeListener {
    /**
     * Called when product was sold from the store.
     * @param product the product that was sold
     */
    void onProductSold(Product product);

    /**
     * Called when a new product was registered in the store.
     * @param product the product that was registered
     */
    void onProductRegistered(Product product);
}
