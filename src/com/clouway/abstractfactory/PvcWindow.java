package com.clouway.abstractfactory;

/**
 * Created by clouway on 16-1-28.
 */
public class PvcWindow implements Parts {
    public PvcWindow(){
        process();
    }

    @Override
    public void process() {
        System.out.println("Producing pvc window");
    }
}
