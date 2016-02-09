package com.clouway.proxypatterntask;

/**
 * Created by clouway on 16-2-3.
 */
public class ProxyInteger implements Integer {

    private RealInteger realInteger;
    private int a;

    public ProxyInteger(int a){
        this.a=a;
    }

    @Override
    public void display() {
        if(realInteger==null){
            realInteger=new RealInteger(a);
        }
        realInteger.display();
    }
}
