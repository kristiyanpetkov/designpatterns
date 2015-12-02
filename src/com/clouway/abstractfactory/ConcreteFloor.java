package com.clouway.abstractfactory;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class ConcreteFloor implements Floor {
    @Override
    public void howHealthyIsFloor() {
        System.out.println("Concrete floor is very healthy");
    }
}
