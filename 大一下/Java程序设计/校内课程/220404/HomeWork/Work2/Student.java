package Work2;
/*
@ THIS FILE IS PART OF mole9630 PROJECT
@ Student.java - This is the java homework for April 6th
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top
*/
import java.util.Objects;

public class Student {
    static String name; //学生姓名
    static int age; //学生年龄

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    //打印学生信息
    void show()
    {
        System.out.println("姓名:" + name + "\n年龄:" + age);
    }

    //判断该学生和另一个学生对象是否相等
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        return name == student.name && Objects.equals(age, student.age);
    }

    public int hashCode() {
        return Objects.hash(name,age);
    }

}
