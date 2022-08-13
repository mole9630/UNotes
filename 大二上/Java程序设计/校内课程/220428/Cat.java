package com;

public class Cat {
    String color;

    void show(String color) //参数为固定类型
    {
        System.out.println(color);
    }

    public <T> void show1(T color) //参数类型不确定
    {
        System.out.println(color);
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.show("white");
//        c.show(123);
        c.show1("white");
        c.show1(123);
    }
}
