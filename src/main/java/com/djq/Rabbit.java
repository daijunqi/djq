package com.djq;

import java.util.Scanner;

/**
 * Created by dai on 16-8-5.
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class Rabbit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        System.out.println(count(day));
    }

    public static int count(int days) {
        if (days < 3)
            return 1;
        else
            return count(days - 1) + count(days - 2);
    }

}
