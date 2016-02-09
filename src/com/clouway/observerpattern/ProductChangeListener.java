package com.clouway.observerpattern;

/**
 * Created by clouway on 16-2-4.
 */
public interface ProductChangeListener {
    void addProduct(Product product);

    void sellProduct(Product product);


}
