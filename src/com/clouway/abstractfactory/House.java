package com.clouway.abstractfactory;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public interface House {
    Door getDoor();
    Window getWindow();
    Floor getFloor();
}
