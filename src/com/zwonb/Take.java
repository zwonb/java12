package com.zwonb;

/**
 * 捕获异常
 * Created by zwonb on 2017/7/3.
 */
public class Take {

    public static void main(String[] args) {
        try {
            String str = "lili";
            System.out.println(str + "年龄是：");
            int age = Integer.parseInt("20L");
            System.out.println(age);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序终止"); //仍然输出，没有因为异常而终止
    }
}
