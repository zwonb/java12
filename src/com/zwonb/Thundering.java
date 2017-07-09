package com.zwonb;

/**
 * 异常错误
 * Created by zwonb on 2017/7/3.
 */
public class Thundering {

    public static void main(String[] args) {
        String str = "lili";
        System.out.println(str + "年龄是：");
        int age = Integer.parseInt("20L"); //这里发生异常，程序终止
        System.out.println(age);
    }
}
