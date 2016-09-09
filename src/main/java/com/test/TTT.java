package com.test;

import java.lang.reflect.Method;

/**
 * Created by dai on 16-8-26.
 */
public class TTT {

    public static void main(String[] args) throws Exception{
        Test test = new Test();
        Class clazz = test.getClass();
        Method method = clazz.getDeclaredMethod("test3");
        method.invoke(test);
    }
}
