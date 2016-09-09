package com.djq;

/**
 * Created by dai on 16-8-5.
 * 判断101-200之间有多少个素数，并输出所有素数。
 */
public class Prime {

    public static void main(String[] args) {
        calculate(101, 200);
    }

    public static void calculate(int start, int end) {

        int count=0;

        for (int i = start; i <= end; i++) {
            if (i < 4) {
                System.out.println(i);
                count++;
            } else {
                boolean flag = true;
                for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
