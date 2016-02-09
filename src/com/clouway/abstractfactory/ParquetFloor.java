package com.clouway.abstractfactory;

/**
 * Created by clouway on 16-1-28.
 */
public class ParquetFloor implements Parts {
    public ParquetFloor(){
        process();
    }

    @Override
    public void process() {
        System.out.println("Producing parquet floor");
    }
}
