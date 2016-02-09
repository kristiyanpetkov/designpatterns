package com.clouway.abstractfactory;

/**
 * Created by clouway on 16-1-28.
 */
public class Demo {
    public static void main(String[] args) {

        HouseParts door = FactoryProducer.getFactory("door");
        door.produceParts("wood");
        door.produceParts("pvc");

        HouseParts window = FactoryProducer.getFactory("window");
        window.produceParts("pvc");


    }
}

