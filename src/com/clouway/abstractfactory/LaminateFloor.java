package com.clouway.abstractfactory;

/**
 * Created by clouway on 16-1-28.
 */
public class LaminateFloor implements Parts {
    public LaminateFloor() {
        process();
    }

    @Override
    public void process() {
        System.out.println("Producing laminate floor");
    }
}
