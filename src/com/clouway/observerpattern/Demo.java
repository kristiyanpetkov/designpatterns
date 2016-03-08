package com.clouway.observerpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by clouway on 16-2-8.
 */
public class Demo {
    public static void main(String[] args) {
        ProductsRepository productsRepository = new ProductsRepository();
        SoldProducts soldProducts = new SoldProducts();
        Shop shop = new Shop();
        Product coffee = new Product("Coffee");
        Product water = new Product("Water");
        Product milk = new Product("Milk");

        shop.addListener(productsRepository);
        shop.addListener(soldProducts);

        shop.addProduct(coffee);
        shop.addProduct(coffee);
        shop.addProduct(coffee);


        shop.sellProduct(coffee);
        shop.sellProduct(coffee);
        shop.sellProduct(coffee);

        System.out.println("Products in stock:");
        Map<Product, Integer> map = productsRepository.getAvaibleProducts();
        for (Product product : map.keySet()) {
            System.out.println(product.getProductName() + " : " + map.get(product));

        }

        System.out.println(" ");
        System.out.println("Sold products:");
        Map<Product, Integer> map2 = soldProducts.getSoldProducts();
        for (Product product : map2.keySet()) {
            System.out.println(product.getProductName() + " : " + map2.get(product));
        }

        System.out.println(" ");
        System.out.println("Products in stock:");
        Map<Product, Integer> map3 = productsRepository.getAvaibleProducts();
        for (Product product : map3.keySet()) {
            System.out.println(product.getProductName() + " : " + map3.get(product));

        }


    }
}
