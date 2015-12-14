package com.clouway.pool;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Pool {
    private static List<Test> inUse = new LinkedList<>();
    private static List<Test> available = new LinkedList<>();

    public static Test acquire() {
        synchronized (available) {
            if (available.size() != 0) {
                Test po = available.get(0);
                inUse.add(po);
                available.remove(0);
                return po;
            } else if (available.size() + inUse.size() <= 10) {
                Test po = new PoolTest();
                inUse.add(po);
                return po;
            } else {
                throw new NoFreeResource();
            }
        }
    }

    public static void release(Test po) {
        CleanUp(po);

        synchronized (available) {
            available.add(po);
            inUse.remove(po);
        }
    }

    private static void CleanUp(Test po) {

    }

    private static class PoolTest implements Test{

        @Override
        public String getName() {
            return "slavi";
        }
    }
}
