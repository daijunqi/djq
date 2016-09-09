package com.djq;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by dai on 16-8-5.
 */
public class Narcissus {

    public static void main(String[] args) {
        show();
    }

    public static void show() {
//        Long stamp = 1471226310000L;
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date(stamp));
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int day = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//        int minutes = calendar.get(Calendar.MINUTE);
//        int second = calendar.get(Calendar.SECOND);
//        System.out.println(year + " " + month + " " + day + " " +hour+" "+minutes+" "+second);
//        System.out.println(new Date().getTime()/1000);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date = format.format(new Date());
//        System.out.println(date);

//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2016, Calendar.JANUARY, 31);
//        calendar.add(Calendar.MONTH,1);
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH) + 1;
//        int day = calendar.get(Calendar.DAY_OF_MONTH);
//
//        System.out.println(year + " " + month + " " + day);
//
//        Date date = new Date(2016,1,1);
//        System.out.println(date);

//        Map<Integer, Object> map = new HashMap<Integer, Object>();
//        for (int i = 1; i < 6; i++) {
//            map.put(i, i);
//        }
//
//        for(Object a :map.values()){
//            System.out.println(a+"");
//        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT+9"));
        System.out.println(calendar1.getTime());
    }
}
