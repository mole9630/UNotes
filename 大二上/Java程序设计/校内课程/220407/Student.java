package com;

public class Student extends Person {
    //成员变量
    String sno;

    //构造方法
    Student(){}
    Student(String sno,String name,int age) {
        super(name, age);
        this.sno = sno;
    }

    //打印信息
    public void show()
    {
        System.out.println("学号:" + sno + "\n姓名:" + name + "\n年龄:" + age);
    }

    //子类继承抽象类,子类中要实现父类中的抽象方法
    @Override
    public void play() {
        System.out.println("调用Play成功!");
    }

    public static void main(String[] args) {
        Student stu = new Student("220407","张三",19);
        stu.show();
        stu.play();
    }
}