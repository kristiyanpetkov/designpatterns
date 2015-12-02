package com.clouway.abstractfactory;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class WoodenWindow implements Window {
    @Override
    public void howHealthyIsWindow() {
        System.out.println("Wooden window is not very healthy");
    }
}
