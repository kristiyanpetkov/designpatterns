package com.clouway.abstractfactory;

/**
 * Created by clouway on 16-2-3.
 */
public class FactoryProducer {

    public static HouseParts getFactory(String factory) {
        if (factory.equalsIgnoreCase("floor")) {
            return new FloorFactory();
        } else if (factory.equalsIgnoreCase("window")) {
            return new WindowFactory();
        } else if (factory.equalsIgnoreCase("door")) {
            return new DoorFactory();
        }
        throw new NoSuchFactoryException();
    }
}
