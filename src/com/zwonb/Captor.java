package com.zwonb;

/**
 * Created by zwonb on 2017/7/6.
 */
public class Captor {

    /**
     * 定义方法抛出异常
     */
    static int quotient(int x, int y) throws MyException1 {
        if (y < 0) {
            throw new MyException1("除数不能是负数");//异常信息
        }
        return x / y;
    }

    public static void main(String[] args) {
        try {
            int result = quotient(3, -1);
        } catch (MyException1 myException1) {
            System.out.println(myException1.getMessage());
        } catch (ArithmeticException e) {//处理ArithmeticException异常
            System.out.println("除数不能为0");//输出提示信息
        } catch (Exception e) {//处理其他异常
            System.out.println("程序发生了其他的异常");//输出提示信息
        }
    }
}
