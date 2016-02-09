package com.clouway.abstractfactory;

/**
 * Created by clouway on 16-1-28.
 */
public class FloorFactory implements HouseParts {
    @Override
    public Parts produceParts(String material) {
        if (material.equalsIgnoreCase("laminate")) {
            return new LaminateFloor();
        } else if (material.equalsIgnoreCase("parquet")) {
            return new ParquetFloor();
        }
        return null;
    }
}
