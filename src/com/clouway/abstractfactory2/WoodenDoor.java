package com.clouway.abstractfactory2;

/**
 * Created by clouway on 16-2-17.
 */
public class WoodenDoor implements Door {
    @Override
    public void produce() {
        System.out.println("Producing wooden door");
    }
}
