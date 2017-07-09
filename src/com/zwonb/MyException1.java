package com.zwonb;

/**
 * 自定义异常类
 * Created by zwonb on 2017/7/6.
 */
public class MyException1 extends Exception {

    String message;

    public MyException1(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
