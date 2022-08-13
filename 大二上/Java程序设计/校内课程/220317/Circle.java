package com;

import java.util.Scanner;

public class Circle {
    final static double PI=3.1415926535; //静态变量
    //方法的声明 位置应在:类内,方法外
    public static double zc(int r) //静态方法
    {
        double l = 0;
        l = 2 * PI * r;
        return  l;
    }

    //求面积的方法
    public static double mj(int r)
    {
        double s = 0;
        s = PI * r * r;
        return  s;
    }

    //矩形的周长
    public static double zc(int x,int y) //方法重载(同名方法):方法名相同,参数的个数或参数类型不同
    {
        double l=0;
        l = 2 * (x+y);
        return  l;
    }

    //方法重载演示
    public static double zc(double r) //方法名相同,参数的个数相同,参数类型不同
    {
        return  r*4;
    }

    //返回值为void,表示无返回值
    public static void zc(double a,double b) //方法名相同,参数的个数相同,参数类型不同
    {
        System.out.println("a+b=" + (a+b));
    }

    public static void main(String[] args) { //main为静态方法(static),静态方法中必须调用静态变量和静态方法
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        double zc = zc(r);
        double mj = mj(r);
        System.out.println("圆的周长:" + zc);
        System.out.println("圆的面积:" + mj);
        System.out.println("矩形周长:" + zc(10,15));
        System.out.println("不明算法:" + zc(10.0));
        zc(10.0,12.0);

    }
}