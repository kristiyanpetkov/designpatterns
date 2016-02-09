package com.clouway.abstractfactory;

/**
 * Created by clouway on 16-1-28.
 */
public class WoodenWindow implements Parts {
    public WoodenWindow() {
        process();
    }

    @Override
    public void process() {
        System.out.println("Producing wooden window.");
    }
}
