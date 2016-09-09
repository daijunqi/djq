package com.design.singleton;

/**
 * Created by dai on 16-8-18.
 */
public class Singleton {

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private Singleton(){

    }

    private static class factory{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return factory.instance;
    }

    public static void destory(){

    }


}
