package com.clouway.proxypatterntask;

/**
 * Created by clouway on 16-2-3.
 */
public class RealInteger implements Integer {
    private int a;

    public RealInteger(int a){
        this.a=a;
    }

    @Override
    public void display() {
        System.out.println(a);
    }
}
