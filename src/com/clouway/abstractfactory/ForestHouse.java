package com.clouway.abstractfactory;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class ForestHouse implements House {
    @Override
    public Door getDoor() {
        return new WoodenDoor();
    }

    @Override
    public Window getWindow() {
        return new WoodenWindow();
    }

    @Override
    public Floor getFloor() {
        return new WoodenFloor();
    }
}
