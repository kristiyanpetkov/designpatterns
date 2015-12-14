package com.clouway.pool;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        Test pooledObject= Pool.acquire();
        Test pooledObject1= Pool.acquire();
        Test pooledObject2= Pool.acquire();
        Test pooledObject3= Pool.acquire();
        Test pooledObject4= Pool.acquire();
        Test pooledObject5= Pool.acquire();
        Test pooledObject6= Pool.acquire();
        Test pooledObject7= Pool.acquire();
        Test pooledObject8= Pool.acquire();
        Test pooledObject9= Pool.acquire();
        Test pooledObject10= Pool.acquire();
        Pool.release(pooledObject);
        Test pooledObject11= Pool.acquire();
        //Test pooledObject12= Pool.acquire();
    }
}
