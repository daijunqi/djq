package com.design.builder;

/**
 * Created by dai on 16-8-18.
 */
public class Bean {

    private String a;

    private String b;

    private String c;

    private String d;

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public Bean setA(String a){
        this.a =a;
        return this;
    }

    public Bean setB(String b) {
        this.b = b;
        return this;
    }

    public Bean setC(String c) {
        this.c = c;
        return this;
    }

    public Bean setD(String d) {
        this.d = d;
        return this;
    }
}
