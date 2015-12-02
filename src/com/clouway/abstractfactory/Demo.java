package com.clouway.abstractfactory;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        House forestHouse=new ForestHouse();
        Door door=forestHouse.getDoor();
        Floor floor=forestHouse.getFloor();
        Window window=forestHouse.getWindow();
        door.howHealthyIsDoor();
        floor.howHealthyIsFloor();
        window.howHealthyIsWindow();

        House cityHouse=new CityHouse();
        Door door1=cityHouse.getDoor();
        Floor floor1=cityHouse.getFloor();
        Window window1=cityHouse.getWindow();
        door1.howHealthyIsDoor();
        floor1.howHealthyIsFloor();
        window1.howHealthyIsWindow();
    }
}
