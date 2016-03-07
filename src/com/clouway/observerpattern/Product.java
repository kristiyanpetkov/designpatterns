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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return !(productName != null ? !productName.equals(product.productName) : product.productName != null);

    }

    @Override
    public int hashCode() {
        return productName != null ? productName.hashCode() : 0;
    }
}
