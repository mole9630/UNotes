package Study;
/*
@ THIS FILE IS PART OF mole9630 PROJECT
@ Book.java - This is the java homework for April 1st
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top
*/
public class Book {
//  1.类中包含成员变量：书名、书号、主编、出版社、页数、价格，均为私有的。
    private String bookTitle;
    private String bookNumber;
    private String edit;
    private String publishingHouse;
    private int numberOfPages;
    private double price;

//3.设计类的有参数构造方法和无参数构造方法。
    //无参构造方法
    Book(){
    }
    //有参构造方法
    public Book(String bookTitle, String bookNumber, String edit, String publishingHouse, int numberOfPages, double price) {
        this.bookTitle = bookTitle; //书名
        this.bookNumber = bookNumber; //书号
        this.edit = edit; //主编
        this.publishingHouse = publishingHouse; //出版社
        this.numberOfPages = numberOfPages; //页数
        this.price = price; //价格
    }

//  2.要求提供所有成员变量的只读权限（getter方法），提供价格的修改权限（setter方法）
    //getter
    public String getBookTitle() {
        return bookTitle;
    }
    public String getBookNumber() {
        return bookNumber;
    }
    public String getEdit() {
        return edit;
    }
    public String getPublishingHouse() {
        return publishingHouse;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public double getPrice() {
        return price;
    }
    //setter
    public void setPrice(double price) {
        this.price = price;
    }

    //打印属性值
    void show()
    {
        System.out.print("书名:" + bookTitle + "\n书号:" + bookNumber + "\n主编:" + edit + "\n出版社:" + publishingHouse + "\n页数:" + numberOfPages + "\n价格:" + price);
    }
}
