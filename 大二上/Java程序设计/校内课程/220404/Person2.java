package com;

public class Person2 {
    private static int count=0;
    //成员变量
    int id;
    String name;
    int age;

    //序号自加构造方法
    Person2()
    {
        id = ++count;
    }

    //重写toString()方法
    public String toString()
    {
        return id + "\t\t" + name + "\t\t" + age;
    }

    //非静态方法
    public void show()
    {
        System.out.println("调用show方法成功!");
    }
    //静态方法
    public static void showTwo()
    {
        System.out.println("调用showTwo静态方法成功!");
    }

    public static void main(String[] args) {
        System.out.println("序号\t\t姓名\t\t年龄");
        Person2 p1 = new Person2(); //调用无参构造方法(++count) id=1
        p1.name = "张三";
        p1.age = 18;
        System.out.println(p1);

        Person2 p2 = new Person2(); //调用无参构造方法(++count) id=2
        p2.name = "李四";
        p2.age = 20;
        System.out.println(p2);

        Person2 p3 = new Person2(); //调用无参构造方法(++count) id=3
        p3.name = "王五";
        p3.age = 22;
        System.out.println(p3);

        Person2 p4 = new Person2(); //调用无参构造方法(++count) id=4
        p4.name = "赵一";
        p4.age = 24;
        System.out.println(p4);

        Person2 p5 = new Person2(); //调用无参构造方法(++count) id=5
        p5.name = "钱二";
        p5.age = 26;
        System.out.println(p5);

        p1.show(); //非静态方法 --使用对象来调用
        Person2.showTwo(); //静态方法 --直接使用:类名.方法名([参数])的方式调用静态方法
//        Person2.show(); //静态方法中不能直接引用非静态成员
    }
}