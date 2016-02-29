package com.clouway.objectpoolpatern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clouway on 16-2-2.
 */
public abstract class ObjectPool<T> {
    private List<T> available = new ArrayList<>();
    private List<T> locked = new ArrayList<>();
    private int maxInstance;

    public ObjectPool(int maxInstance) {
        this.maxInstance = maxInstance;

    }

    protected abstract T create();

    public synchronized T acquire() {
        if (!available.isEmpty()) {
            T instance = available.iterator().next();
            locked.add(instance);
            available.remove(instance);
            return instance;
        } else if (locked.size() <= maxInstance) {
            T instance = create();
            locked.add(instance);
            return instance;
        }
        throw new NoFreeResourceException();
    }

    public synchronized void release(T instance) {
        if (!locked.isEmpty()) {
            available.add(instance);
            locked.remove(instance);
        }
    }

    @Override
    public String toString() {
        return String.format("Pool available=%d locked=%d", available.size(), locked.size());
    }
}
