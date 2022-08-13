package com;

public class Boy {
    String name;
    public Boy()
    {
        this("张三"); //调用本类中带有一个参数(数据类型为String)的构造方法
    }
//    Boy(String n) //可行,但不建议
//    {
//        name = n;
//    }
    public Boy(String name) //推荐使用该方法构造
    {
        this.name = name;
    }

    public static void main(String[] args) {
        Boy b = new Boy();
        System.out.println(b); //com.Boy@1b6d3586
        System.out.println(b.name); //张三
    }
}
