package com.test;

/**
 * Created by dai on 16-8-28.
 */
public class ChildTest extends StaticTest {

    public static void main(String[] args){
        System.out.println("456");
    }

    static {
        System.out.println("child");
    }
    {System.out.println("child123");}
}
