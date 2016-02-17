package com.clouway.abstractfactory2;

/**
 * Created by clouway on 16-2-17.
 */
public class PvcFactory extends AbstractHousePartFactory {
    @Override
    public Door createDoor() {
        return new PvcDoor();
    }

    @Override
    public Window createWindow() {
        return new PvcWindow();
    }

    @Override
    public Floor createFloor() {
        return new PvcFloor();
    }
}
