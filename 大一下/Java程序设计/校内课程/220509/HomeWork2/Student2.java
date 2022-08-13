package HomeWork;
/**
 @ THIS FILE IS PART OF mole9630 PROJECT
 @ Student2.java - This is the java homework for May 14th
 @ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
 @ Copyright (c) 2022 mole9630(Github)
 @ www.mole9630.top | me@mole9630.top

 * 向hashset中存储对象
 * 新建Student对象，包括学号，姓名，年龄，添加全参构造器，重写tostring
 * 新建测试类Test，向hashset中添加学生对象：
 * Student{sno='s001', name='张三', age='18'}
 * Student{sno='s002', name='李四', age='19'}
 * Student{sno='s003', name='王五', age='20'}
 * Student{sno='s003', name='王五', age='20'}
 * 打印hashset
 * 重写Student的hashcode和equals方法,再次打印Test类的hashset
 */
import java.util.Objects;

public class Student2 { //重写hashcode和equals方法的Student2类
    private String sno; //学号
    private String name; //姓名
    private int age; //年龄

    //无参及有参构造方法
    public Student2() {
    }
    public Student2(String sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals及hashCode方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student2)) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age && Objects.equals(sno, student2.sno) && Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name, age);
    }
}