package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dai on 16-8-26.
 */
public class S {

    public static void main(String[] args) {
//        int i =0;
//        SS ss = new SS(500);
//        for (; ss.length > 1; ) {
//            i = ss.add(i, 3);
//            i = ss.remove(i);
//        }
//        System.out.println(ss.a[1]);
        test3();
    }

    public static void test(){
        Bean a = new Bean();
        a.setA("a");
        a.setB("b");

        Bean b = new Bean();
        b.setA("A");
        b.setB("B");

        a.setBean(b);

        Bean c = new Bean();
        c.setA("AA");
        c.setB("BB");

       a.setBean(c);

        System.out.println(a.getBean());

        StringBuffer d = new StringBuffer("a");
        d.append("1");
    }

    public static void test2(){
        String a ="123154";
        System.out.println(a.length());
        System.out.println();
    }

    public static void test3(){
        Map a = new HashMap();
        a.put(1,2);
        System.out.println(a.remove(1));
    }
}
