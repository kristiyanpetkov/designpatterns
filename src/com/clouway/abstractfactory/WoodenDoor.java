package com.clouway.abstractfactory;

/**
 * Created by clouway on 16-1-28.
 */
public class WoodenDoor implements Parts {
    public WoodenDoor(){
        process();
    }
    @Override
    public void process() {
        System.out.println("Producing wooden door");
    }
}
