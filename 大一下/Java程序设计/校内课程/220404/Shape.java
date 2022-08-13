package com;

//public final class Shape { //最终类:不能被继承
public class Shape {
    public final double zc(double a,double b) //矩形周长 --最终方法:子类不能覆盖
    {
        System.out.println("调用父类中求周长的方法成功!");
        return 2*(a+b);
    }
}
