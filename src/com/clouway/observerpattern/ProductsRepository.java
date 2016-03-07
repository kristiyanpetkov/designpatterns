package com.clouway.observerpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by clouway on 16-2-8.
 */
public class ProductsRepository implements ProductChangeListener {

   private Map<Product,Integer> avaibleProducts = new HashMap<Product,Integer>();



    public void addProduct(Product product) {
       if(avaibleProducts.containsKey(product)){
           avaibleProducts.put(product,avaibleProducts.get(product)+1);
       }else {
           avaibleProducts.put(product, 1);
       }
    }

    @Override
    public void sellProduct(Product product) {
        if(avaibleProducts.containsKey(product) && avaibleProducts.get(product)>0){
            avaibleProducts.put(product,avaibleProducts.get(product)-1);
        }else{
           avaibleProducts.remove(product);
            throw new RuntimeException("Product out of order!");
        }
    }

    public Map<Product,Integer> getAvaibleProducts(){
        return avaibleProducts;

    }
}
