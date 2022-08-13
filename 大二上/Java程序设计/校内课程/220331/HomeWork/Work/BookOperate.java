package Study;
/*
@ THIS FILE IS PART OF mole9630 PROJECT
@ Book.java - This is the java homework for April 1st
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top
*/
public class BookOperate {
    public static void main(String[] args) {
        Book book = new Book("Java程序设计","978-7-5667-2245-4","张宏升,刘念,王莉","湖南大学出版社",285,39.8);
        book.setPrice(49.8); //利用set修改价格
        book.show();//调用打印信息的构造方法

    }
}
