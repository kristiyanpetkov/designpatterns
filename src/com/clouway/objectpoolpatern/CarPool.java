package com.clouway.objectpoolpatern;

/**
 * Created by clouway on 16-2-2.
 */
public class CarPool extends ObjectPool<Car> {
    @Override
    protected Car create() {
        return new Car();
    }
}
