package Work1;
/*
@ THIS FILE IS PART OF mole9630 PROJECT
@ Person.java - This is the java homework for April 6th
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top
*/
public class Person {
    private String name; //姓名
    private int age; //年龄

    //无参构造方法
    Person(){
    }

    //有参构造方法
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    //get和set
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
