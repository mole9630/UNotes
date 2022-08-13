package com;

public class BookOperator {
    Book b1 = new Book("book1成员变量初始化"); //2 再初始化
    static Book b2 = new Book("static book2成员变量初始化"); //1 先初始化
    Book b3 = new Book("book3成员变量初始化"); //2 再初始化
    static Book b4 = new Book("static book4成员变量初始化"); //1 先初始化
    BookOperator(String msg)
    {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        BookOperator bp = new BookOperator("BookOperator类的对象初始化"); //3 最后初始化
    }
}