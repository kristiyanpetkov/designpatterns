package com.clouway.proxy;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Client {
    private final Integer integer;

    public Client(Integer integer) {
        this.integer = integer;
    }

    public void method() {
        integer.someMethod();
    }
}
