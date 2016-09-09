package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dai on 16-8-11.
 */
public class Bean {

    private String a;

    private String b;

    private List<Bean> bean = new ArrayList<Bean>();

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public List<Bean> getBean() {
        return bean;
    }

    public synchronized void setBean(Bean bean) {
        this.bean.add(bean);
    }
}
