package com.clouway.objectpoolpatern;

/**
 * Created by clouway on 16-2-2.
 */
public class Demo {
    public static void main(String[] args) {
        CarPool pool = new CarPool(10);
//        System.out.println(pool);
//        Car car1=pool.acquire();
//        Car car2=pool.acquire();
//        Car car3=pool.acquire();
//        Car car4=pool.acquire();
//        Car car5=pool.acquire();
//        Car car6=pool.acquire();
//        Car car7=pool.acquire();
//        Car car8=pool.acquire();
//        Car car9=pool.acquire();
//        System.out.println(pool);
//        pool.release(car9);
//        System.out.println(pool);
//        pool.acquire();
//        System.out.println(pool);
//        pool.acquire();
//        System.out.println(pool);
//        pool.release(car9);
//        System.out.println(pool);
//        pool.release(car8);
//        System.out.println(pool);
//        pool.release(car7);
//        System.out.println(pool);
        Car car=null;
       pool.release(car);
        System.out.println(pool);

    }
}
