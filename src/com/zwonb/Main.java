package com.zwonb;

public class Main {

    public static void main(String[] args) {

        int result = 3 /0; //除数不能为0 此处异常以下将不再执行，程序被终止
        System.out.println(result);
    }
}
