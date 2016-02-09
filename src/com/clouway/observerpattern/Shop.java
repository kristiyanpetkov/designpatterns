package com.clouway.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clouway on 16-2-8.
 */
public class Shop {

    List<ProductChangeListener> productChangeListenerList = new ArrayList<ProductChangeListener>();

    public void addProduct(Product product){
        for(ProductChangeListener productChangeListener : productChangeListenerList){
            productChangeListener.addProduct(product);
        }
    }

    public void sellProduct(Product product){
        for (ProductChangeListener productChangeListener : productChangeListenerList){
            productChangeListener.sellProduct(product);
        }
    }

    public void addListener(ProductChangeListener productChangeListener){
        productChangeListenerList.add(productChangeListener);
    }
}
