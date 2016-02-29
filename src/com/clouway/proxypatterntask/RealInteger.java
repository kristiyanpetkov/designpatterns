package com.clouway.proxypatterntask;

/**
 * Created by clouway on 16-2-3.
 */
public class RealInteger implements Integer {
    private int value;

    public RealInteger(int value){
        this.value = value;
    }

    @Override
    public void display() {
        System.out.println(value);
    }
}
