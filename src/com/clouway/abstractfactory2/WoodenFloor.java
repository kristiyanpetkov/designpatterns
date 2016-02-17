package com.clouway.abstractfactory2;

/**
 * Created by clouway on 16-2-17.
 */
public class WoodenFloor implements Floor {
    @Override
    public void produce() {
        System.out.println("Producing wooden floor");
    }
}
