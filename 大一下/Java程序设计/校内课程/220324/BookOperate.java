package com;

public class BookOperate {
    public static void main(String[] args) {
        Book book1 = new Book(); //方法1:创建对象book1,并分配存储空间
        Book book2; //方法2:创建对象book2
        book2 = new Book(); //使用new对声明的对象分配存储空间

        //类实例化-对象初始化
        Book book3 = new Book("000-7-5667-2245-4","《C语言程序设计》",49.8,"-");

        //对象的引用
        book1.isbn = "978-7-5667-2245-4";
        book1.name = "《Java语言程序设计》";
        book1.price = 49.8;
        book1.author = "-";

        book1.buy();
        book1.read();
        book1.show();
        System.out.println("\n**** book3 ****");
        book3.buy();
        book3.read();
        book3.show();
    }
}
