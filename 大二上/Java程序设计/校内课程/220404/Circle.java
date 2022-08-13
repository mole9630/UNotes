package com;

public class Circle {
    final double PI=3.1415926535; //使用final修饰的"变量"为常量
    public static void zc(final double p1,double r)
    {
//        p1 = 123.0; //使用final操作的变量,不能进行第二次赋值
        System.out.println(2*p1*r);
    }

    public static void main(String[] args) {
        zc(3.14,10); //周长
    }
}
