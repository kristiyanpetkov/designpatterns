package com.clouway.abstractfactory2;

/**
 * Created by clouway on 16-2-17.
 */
public class WoodFactory extends AbstractHousePartFactory {
    @Override
    public Floor createFloor() {
        return new WoodenFloor();
    }

    @Override
    public Window createWindow() {
        return new WoodenWindow();
    }

    @Override
    public Door createDoor() {
        return new WoodenDoor();
    }
}
