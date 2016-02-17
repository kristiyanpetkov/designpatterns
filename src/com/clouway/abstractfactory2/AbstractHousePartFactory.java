package com.clouway.abstractfactory2;

/**
 * Created by clouway on 16-2-17.
 */
public abstract class AbstractHousePartFactory {
    public abstract Window createWindow();
    public abstract Door createDoor();
    public abstract Floor createFloor();
}
