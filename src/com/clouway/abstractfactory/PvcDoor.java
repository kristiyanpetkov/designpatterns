package com.clouway.abstractfactory;

/**
 * Created by clouway on 16-1-28.
 */
public class PvcDoor implements Parts {
    public PvcDoor(){
        process();
    }

    @Override
    public void process() {
        System.out.println("Producing pvc door");
    }
}
