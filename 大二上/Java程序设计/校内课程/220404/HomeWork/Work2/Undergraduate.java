package Work2;
/*
@ THIS FILE IS PART OF mole9630 PROJECT
@ Undergraduate.java - This is the java homework for April 6th
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top
*/
public class Undergraduate extends Student {
    String degree;

    public Undergraduate(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    //打印学生信息
    void show()
    {
        System.out.println("姓名:" + name + "\n年龄:" + age + "\n学位为:" + degree);
    }
}
