package com.clouway.singleton;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        try {
            Class class1=Class.forName("com.clouway.singleton.Singleton");
            Singleton singleton2=(Singleton)class1.newInstance();
            System.out.println(singleton2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
