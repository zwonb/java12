package com.zwonb;

/**
 * 在方法中抛出异常
 * Created by zwonb on 2017/7/6.
 */
public class Shoot {

    static void pop() throws NegativeArraySizeException {
        //定义方法并抛出NegativeArraySizeException异常
        int[] arr = new int[-3];
    }

    public static void main(String[] args) {
        try {
            pop();
        } catch (NegativeArraySizeException e) {
            System.out.println("pop()方法抛出的异常"); //输出异常信息
        }
    }
}
