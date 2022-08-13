package com;

import com.sun.xml.internal.ws.server.ServerRtException;

public class Book {
    //类成员变量
    String isbn;
    String name;
    double price;
    String author;

    //构造方法(构造方法无返回值)
    public Book() //默认构造方法(可不写)
    /**
     * 类修饰符public
     * 有public修饰符的 同一包中的类:可访问 不同包中的类:可访问
     * 无任何修饰符的 同一包中的类:可访问 不同包中的类:不可访问
     */
    {
    }
    public Book(String isbn, String name, double price,String author)
    {
        this.isbn = isbn; //this代表当前活动对象,this. isbn表示当前类的成员变量isbn,右侧的isbn表示形参
        this.name = name;
        this.price = price;
        this.author = author;
    }

    //方法
    public void read()
    {
        System.out.println("读书成功!");
    }
    public void buy()
    {
        System.out.println("买书成功!");
    }
    public void show()
    {
        System.out.println("ISBN:" + isbn + "\n书名:" + name + "\n价格:" + price + "\n作者:" + author);
    }
}