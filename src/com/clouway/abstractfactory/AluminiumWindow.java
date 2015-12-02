package com.clouway.abstractfactory;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class AluminiumWindow implements Window {
    @Override
    public void howHealthyIsWindow() {
        System.out.println("Aluminium window is very healthy");
    }
}
