package com;

public class Rectangle extends Shape { //不能继承用final修饰的类
//    public double zc(double a,double b) //矩形周长 --重写父类中的zc方法
//    //子类不能覆盖父类中的final方法
//    {
//        System.out.println("调用子类中求周长的方法成功!");
//        return 2*(a+b);
//    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.zc(2,4));;
    }
}
