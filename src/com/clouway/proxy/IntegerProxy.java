package com.clouway.proxy;

import java.lang.*;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class IntegerProxy implements Integer {
    private IntegerSubject integerSubject;
    @Override
    public void someMethod() {
        integerSubject=new IntegerSubject();
        integerSubject.someMethod();
    }
}
