package com;

public class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id,String name,int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show()
    {
        System.out.print("姓名:" + name + "\n" + "学号:" + id + "\n" + "年龄:" + age);
    }
}
