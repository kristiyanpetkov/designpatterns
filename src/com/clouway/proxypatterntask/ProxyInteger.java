package com.clouway.proxypatterntask;

/**
 * Created by clouway on 16-2-3.
 */
public class ProxyInteger implements Integer {

    private RealInteger realInteger;

    public ProxyInteger(int value){
       this.realInteger= new RealInteger(value);
    }

    @Override
    public void display() {
        realInteger.display();
    }
}
