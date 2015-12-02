package com.clouway.abstractfactory;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class AluminumDoor implements Door {
    @Override
    public void howHealthyIsDoor() {
        System.out.println("Aluminium door is very healthy");
    }
}
