package com.clouway.observertask;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Demo {

    public static void main(String[] args) {
        CompositeProductChangeListener listener = new CompositeProductChangeListener();
        listener.addListener(new ConsoleDisplay());
        listener.addListener(new ProductInventory());

        Seller seller = new Seller(listener);

        seller.sellProduct(new Product("Apple"));


    }
}
