package com;

public abstract class Person { //抽象类:使用abstract修饰类
    //成员变量
    String name;
    int age;
    //成员方法
    void show() //打印姓名
    {
        System.out.println("姓名:" + name + "\n年龄:" + age);
    }

    //无参构造方法
    Person()
    {
    }

    //有参构造方法
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //抽象方法(可有可无)
    public abstract void play(); //抽象方法无方法体

}
