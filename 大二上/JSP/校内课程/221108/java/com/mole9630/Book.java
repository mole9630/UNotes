package com.mole9630;

public class Book {
    private String bookID;
    private String bookName;

    public Book() {
        bookID = "0001";
        bookName = "JSP网站开发";
    }

    public Book(String bookID, String bookName) {
        this.bookID = bookID;
        this.bookName = bookName;
    }

    public String getBookID() {
        return bookID;
    }
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
