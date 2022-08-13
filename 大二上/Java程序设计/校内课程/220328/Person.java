package com;

public class Person {
    String name;
    char sex;
    int age;
    String idCord;

    public Person()
    {
        System.out.println("我是Person类中的无参构造方法");
    }
    public Person(String name)
    {
        this.name = name;
    }
}
