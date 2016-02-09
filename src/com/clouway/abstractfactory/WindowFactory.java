package com.clouway.abstractfactory;

/**
 * Created by clouway on 16-1-28.
 */
public class WindowFactory implements HouseParts {
    @Override
    public Parts produceParts(String material) {
        if (material.equalsIgnoreCase("wood")) {
            return new WoodenWindow();
        } else if (material.equalsIgnoreCase("pvc")) {
            return new PvcWindow();
        }
        return null;
    }
}
