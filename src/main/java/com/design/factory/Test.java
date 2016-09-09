package com.design.factory;

import java.util.Scanner;

/**
 * Created by dai on 16-8-18.
 */
public class Test {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        factory(scanner.nextInt());
    }

    public static void factory(int i){

        Base base = null;

        switch (i){
            case 1 : base = new Implement1();;break;
            case 2 : base = new Implement2();;break;
            default:
        }

        base.show();

    }
}
