package com.clouway.proxypatterntask;

/**
 * Created by clouway on 16-2-3.
 */
public class IntegerFactory {
    public static ProxyInteger createInstance(int a){
        return new ProxyInteger(a);
    }
}
