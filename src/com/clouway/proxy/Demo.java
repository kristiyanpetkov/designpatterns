package com.clouway.proxy;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        Integer integer= IntegerFactory.createInstance();
        Client client=new Client(integer);
        client.method();
    }
}
