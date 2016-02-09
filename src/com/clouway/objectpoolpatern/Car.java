package com.clouway.objectpoolpatern;

/**
 * Created by clouway on 16-2-2.
 */
public class Car {
    private static int counter = 1;
    private final int id;

    public Car(){
        id=counter++;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return String.format("Car id=%d", id);
    }
}
