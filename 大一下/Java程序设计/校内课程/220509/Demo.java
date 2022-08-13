package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public void div() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
//        if (b==0)
//        {
//            System.out.println("除数不能为0");
//        }
//        else
//        {
//            double d1 = a / b;
//            System.out.println(d1);
//        }
        double d1 = a / b;
        System.out.println(d1);
    }

    public static void main(String[] args) {
        System.out.println(1.0 / 0);
//        System.out.println(1/0); //ArithmeticException: / by zero
        Demo d = new Demo();
        try { //此次为可能出现异常的语句块
            d.div();
//        } catch (Exception e) { //此次为异常处理语句块
        } catch (InputMismatchException e) {
            System.out.println("输入不匹配的数据类型-异常");
        } catch (ArithmeticException e) { //只能捕获ArithmeticException(算数)异常
            System.out.println("getMessage:" + e.getMessage()); /// by zero 输出异常信息
            System.exit(0); //退出程序,不再执行后面的代码
            System.out.println("toString:" + e.toString()); //java.lang.ArithmeticException: / by zero 简单信息描述
            e.printStackTrace(); //输出异常堆栈信息
        } catch (Exception e) { //此句可以捕获所有异常,如果要使用,一般放在最后
            System.out.println("未知其他异常");
        } finally{ //此次为不管是否出现异常，都会执行的语句块
            System.out.println("这一段代码不管是否出现异常都会执行");
        }
    }
}