package com.test;

import java.text.SimpleDateFormat;

/**
 * Created by dai on 16-8-11.
 */
public class T {

    public static void main(String[] args) throws Exception {

        SimpleDateFormat format =new SimpleDateFormat("yyyy年MM月dd号");
        System.out.println(format.format(1471333087000L));
    }
}
