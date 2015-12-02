package com.clouway.abstractfactory;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class WoodenDoor implements Door {
    @Override
    public void howHealthyIsDoor() {
        System.out.println("Wooden door is not very healthy");
    }
}
