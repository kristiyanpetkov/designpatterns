package com.clouway.objectpoolpatern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clouway on 16-2-2.
 */
public abstract class ObjectPool<T> {
    private List<T> available = new ArrayList<>();
    private List<T> inUse = new ArrayList<>();

    protected abstract T create();

    public synchronized T acquire() {
        if (available.size() > 0) {
            T instance = available.iterator().next();
            inUse.add(instance);
            available.remove(instance);
            return instance;
        } else if (available.size() + inUse.size() <= 9) {
            T instance = create();
            inUse.add(instance);
            return instance;
        } else {
            throw new NoFreeResourceException();
        }
    }

    public synchronized void release(T instance) {
        available.add(instance);
        inUse.remove(instance);
    }

    @Override
    public String toString() {
        return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
    }
}
