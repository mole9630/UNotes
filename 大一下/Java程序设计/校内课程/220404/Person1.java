package com;

public class Person1 {
    //成员变量
    String name;
    static int age; //静态变量(类的成员变量) --变成了静态成员变量
    //重写toString()方法
    public String toString()
    {
        return "姓名:" + name + ",年龄:" + age;
    }

    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "张三";
        p1.age = 18;
        System.out.println(p1);  //com.Person@1b6d3586(输出的是对象的地址)
        System.out.println(p1.toString()); //com.Person@1b6d3586(输出的是对象的地址)
        System.out.println(p1);  //姓名:张三,年龄:18(重写toString()方法后)
        System.out.println(p1.toString()); //姓名:张三,年龄:18(重写toString()方法后)

        Person1 p2 = new Person1();
        p2.name = "李四";
        p2.age = 22;
        System.out.println(p2.toString()); //姓名:李四,年龄:22

        System.out.println(p1); //姓名:张三,年龄:22
        System.out.println(p2); //姓名:李四,年龄:22
        //每个对象都是独立存在的,互不影响
    }
}
