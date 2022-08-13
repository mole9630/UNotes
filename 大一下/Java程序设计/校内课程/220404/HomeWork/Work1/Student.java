package Work1;
/*
@ THIS FILE IS PART OF mole9630 PROJECT
@ Student.java - This is the java homework for April 6th
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top
*/
public class Student extends Person {
    String sno; //学号

    //无参构造方法
    Student(){
    }

    //有参构造方法
    public Student(String name, int age, String sno) {
        super(name, age);
        this.sno = sno;

    }
    //打印学生信息
    public void show(){
        System.out.println("学号:" + sno + "\n姓名:" + getName() + "\n年龄:" + getAge());
    }
}