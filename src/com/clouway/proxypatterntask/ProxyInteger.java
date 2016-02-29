package com.clouway.proxypatterntask;

/**
 * Created by clouway on 16-2-3.
 */
public class ProxyInteger implements Integer {

    private RealInteger realInteger;
    private int value;

    public ProxyInteger(int value){
        this.value = value;
    }

    @Override
    public void display() {
        if(realInteger==null){
            realInteger=new RealInteger(value);
        }
        realInteger.display();
    }
}
