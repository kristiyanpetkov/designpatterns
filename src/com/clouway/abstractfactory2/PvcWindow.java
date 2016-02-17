package com.clouway.abstractfactory2;

/**
 * Created by clouway on 16-2-17.
 */
public class PvcWindow implements Window {
    @Override
    public void produce() {
        System.out.println("Producing pvc window");
    }
}
