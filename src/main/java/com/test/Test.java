package com.test;

import org.apache.commons.lang.exception.ExceptionUtils;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

/**
 * Created by dai on 16-8-6.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        ttt();
    }

    public static void error() {
        try {
            int i = 1 / 0;
            System.out.print(i);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(ExceptionUtils.getFullStackTrace(e));
        }
    }

    public static void test() {
        String name = "254.5632.jpg";
        String type = name.substring(name.lastIndexOf(".") + 1);
        String real = name.substring(0, name.lastIndexOf("."));
        System.out.print(real);
    }

    public static void testNull() {
        Long a = null;
        Long b = 20L;
        if (a == null || a.equals(b)) {
            System.out.print("success");
        }
    }

    public static long getTimesMorning(Long stamp) throws Exception {
        Date date = new Date(stamp);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTimeInMillis() / 1000;
    }

    public static void test1() {
        Map<Integer, Object> a = new TreeMap<Integer, Object>();
        for (int i = 1; i < 20; i++) {
            a.put(i, i);
        }

        Collection b = a.values();
        for (Object i : b) {
            System.out.println(i + "");
        }
    }

    private static void test2() {
        Bean bean = new Bean();
        bean.setA("a");
        bean.setB("b");
        Bean bean1 = new Bean();
        bean1.setA("A");
        bean1.setB("B");
        bean1.setBean(bean);

        System.out.println(bean);
    }

    public void test3() {
//        Map map =new HashMap();
//        map.put("1",1);
//        map.put("2",2);
//        List<Integer> e1 = new ArrayList<Integer>();
//        for(int i=1;i<5;i++){
//            e1.add(i);
//        }
//        map.put("e",e1);
//        List<Integer> e =(List<Integer>)map.get("e");
//        Object[] f =e.toArray();
//        for(Object o :f){
//            System.out.println((Integer)o+1);
//        }
//        System.out.println(f);

//        String ss = "select dbc,cdcd,cdc,dcdcd,cd from (select * from dsfsd)a where s=s";
//        String count = "select count(*) "+ ss.substring(ss.indexOf("from"));
//        System.out.println(count);
//
//        Map<String,Object> map = new HashMap<String, Object>();
//        System.out.println(map.get("123"));
//
//        String a = null;
//        System.out.println(a.trim());
//        System.out.println("test".equals(aaa.test.name()));

//        long i = Integer.MAX_VALUE;
//        i = i*1000;
//        Date date = new Date(i);
//        System.out.println(date);
//        System.out.print(i);
        String pat = Test.class.getResource("/").getFile();
        System.out.print(pat);
    }

//    public enum aaa{

    private static void ttt() {
//        int i = 2;
//        int j = 1;
//        System.out.println((i+=i-=i*i));
//        System.out.println((j=+2));
//        short i = 127;
//        int x = 1;
//        x += i;
//        x = x + i;
//        System.out.println(i);
//        Random random = new Random();
//        int i = random.nextInt();
//        System.out.println(i>>1);
//        List a = new ArrayList(9);
//        for(int i=0;i<12;i++){
//            a.add(i);
//        }
//        System.out.println(a.size());
        char[] a = new char[10];
        for(int i=0;i<10;i++){
            a[i] = (char)('a'-i);
            Arrays.sort(a);
        }
        for(char b : a){
            System.out.println('A'+1);
        }
    }

}
