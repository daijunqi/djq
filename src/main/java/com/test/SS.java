package com.test;

/**
 * Created by dai on 16-8-26.
 */
public class SS {

    public static Integer[] a;

    public static int length;

    public SS(int sum) {
        a = new Integer[sum+1];
        length = sum;
        for (int i = 1; i <= sum; i++) {
            a[i] = i;
        }
    }

    public int remove(int i) {
        System.out.println(a[i]);
        for (int j = i; j < length; j++) {
            a[j] = a[j + 1];
        }

        a[length] = null;
        length = length - 1;
        return i-1;
    }

    public int add(int start, int add) {
        int now = start + add ;
        for (;now > length;) {
            now = now -length;
        }
        return now;

    }


}
