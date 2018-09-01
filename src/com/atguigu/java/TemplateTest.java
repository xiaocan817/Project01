package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author XC
 * @date 2018/8/31 - 20:06
 *
 * IDEA中代码模板所处的位置：Settings - Editor - Live Templates 或 Settings - Editor - General - Postfix Completion
 */
public class TemplateTest {

    //模板六：prsf private static final
    private static final Customer CUST = new Customer();

    //变形：psf
    public static final int NUM = 1;

    //变形psfi
    public static final int NUM2 = 2;
    //变形psfs
    public static final String NATION = "china";

    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println("hello");

        //变形soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            System.out.println(o);
        }
        
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }

    public void method() {
        System.out.println("TemplateTest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //模板五：ifn
        if (list == null) {

        }

        //变形：inn
        if (list != null) {

        }

        //变形：xxx.null / xxx.nn
        if (list == null) {

        }

        if (list != null) {

        }
    }

}
