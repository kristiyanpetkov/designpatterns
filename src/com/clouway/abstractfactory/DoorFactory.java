package com.clouway.abstractfactory;


/**
 * Created by clouway on 16-1-28.
 */
public class DoorFactory implements HouseParts {
    @Override
    public Parts produceParts(String material) {
        if (material.equalsIgnoreCase("wood")) {
            return new WoodenDoor();
        } else if (material.equalsIgnoreCase("pvc")) {
            return new PvcDoor();
        }
        return null;
    }
}
