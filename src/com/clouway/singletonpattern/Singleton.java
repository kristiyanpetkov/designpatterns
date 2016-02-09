package com.clouway.singletonpattern;

/**
 * Created by clouway on 16-1-29.
 */
public class Singleton {

    private static Singleton instance = new Singleton();


    private Singleton(){
        System.out.println("Singleton created");
    }

    public static Singleton getInstance(){
        return instance;
    }
}
