package com.design.builder;

import java.lang.reflect.Field;

/**
 * Created by dai on 16-8-18.
 */
public class Test {

    public static void main(String[] args) throws Exception{
        Bean bean = new Bean();
        bean.setA("a").setB("b").setC("c").setD("d");

        Field[] fields = bean.getClass().getDeclaredFields();

        for(Field field : fields){
            field.setAccessible(true);
            System.out.println(field.getName() + ":" + field.get(bean));
        }
    }
}
