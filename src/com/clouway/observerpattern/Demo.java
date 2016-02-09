package com.clouway.observerpattern;

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
        shop.addProduct(water);
        shop.addProduct(milk);

        System.out.println("Products in stock:");
        for (Product product : productsRepository.getAvaibleProducts()) {
            System.out.println(product.getProductName());
        }
        shop.sellProduct(coffee);

        System.out.println("Products in stock after sold product: ");
        for (Product product : productsRepository.getAvaibleProducts()) {
            System.out.println(product.getProductName());
        }

        System.out.println("Sold products:");
        for (Product product : soldProducts.getSoldProducts()) {
            System.out.println(product.getProductName());
        }
    }
}
