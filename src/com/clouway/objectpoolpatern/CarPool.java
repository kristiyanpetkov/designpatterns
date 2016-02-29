package com.clouway.objectpoolpatern;

/**
 * Created by clouway on 16-2-2.
 */
public class CarPool extends ObjectPool<Car> {
    public CarPool(int maxInstance) {
        super(maxInstance);
    }

    @Override
    protected Car create() {
        return new Car();
    }
}
