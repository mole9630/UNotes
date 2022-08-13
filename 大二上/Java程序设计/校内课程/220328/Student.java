package com;

public class Student extends Person { //extends Person 表示Student类继承了Person类
    //Student类是子类,Person类是父类
    //扩展自己的属性和行为
    String Class;
    public Student()
    {
        System.out.println("我是子类Student中的无参数构造方法");
    }
    public Student(String name)
    {
        super(name);
    }

    public static void main(String[] args) {
        Student s = new Student(); //子类无条件继承父类的无参数的构造方法,且如果父类和子类都定义了无参构造方法,那么先执行父类无参方法
        s.name = "张三"; //从父类Prison中继承了name等属性
        s.age = 19;
        s.idCord = "202203280000";
        s.Class = "22001"; //在本类(子类)中扩展的属性
    }
}
