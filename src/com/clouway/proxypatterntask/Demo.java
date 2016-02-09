package com.clouway.proxypatterntask;

/**
 * Created by clouway on 16-2-3.
 */
public class Demo {
    public static void main(String[] args) {
        Integer integer=IntegerFactory.createInstance(5);
        integer.display();
        integer.display();
        integer.display();
    }
}
