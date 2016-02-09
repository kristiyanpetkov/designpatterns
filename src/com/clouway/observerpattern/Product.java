package com.clouway.observerpattern;

/**
 * Created by clouway on 16-2-8.
 */
public class Product {

    private String productName;

    public Product(String productName){
    this.productName =productName;
    }

    public String getProductName(){
        return productName;
    }
}
