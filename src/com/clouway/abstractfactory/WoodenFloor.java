package com.clouway.abstractfactory;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class WoodenFloor implements Floor {
    @Override
    public void howHealthyIsFloor() {
        System.out.println("Wooden floor is not very helthy");
    }
}
