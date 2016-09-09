package com.test;

/**
 * Created by dai on 16-8-28.
 */
public class StaticTest {

//    public static void main(String[] main) {
//        ss();
//    }

//    static StaticTest st = new StaticTest();

    static {
        System.out.println("1");
    }

    {
        System.err.println("2");
    }

    StaticTest() {
        System.out.println("3");
//        System.out.println("a=" + a + ",b=" + b);
    }

    public static void main(String[] a) { System.out.println("1");
    }

    int a = 3;

    static int b = 4;
}
