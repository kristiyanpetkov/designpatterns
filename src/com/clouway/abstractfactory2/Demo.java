package com.clouway.abstractfactory2;

/**
 * Created by clouway on 16-2-17.
 */
public class Demo {
    public static void main(String[] args) {

        AbstractHousePartFactory pvcFactory = new PvcFactory();
        AbstractHousePartFactory woodFactory = new WoodFactory();

        Door door = pvcFactory.createDoor();
        Window window = woodFactory.createWindow();
        Floor floor = woodFactory.createFloor();


    }

}
