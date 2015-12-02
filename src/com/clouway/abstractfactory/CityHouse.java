package com.clouway.abstractfactory;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class CityHouse implements House {
    @Override
    public Door getDoor() {
        return new AluminumDoor();
    }

    @Override
    public Window getWindow() {
        return new AluminiumWindow();
    }

    @Override
    public Floor getFloor() {
        return new ConcreteFloor();
    }
}
