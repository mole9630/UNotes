package Work220416_2;
/**
 @ THIS FILE IS PART OF mole9630 PROJECT
 @ Student.java - This is the java homework for April 17th
 @ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
 @ Copyright (c) 2022 mole9630(Github)
 @ www.mole9630.top | me@mole9630.top

 * 1.定义一个学生类，该类成员变量包括：学号（sno）、姓名（name）、年龄（age）。
 * 2.改写equals方法，实现可以通过学号判断两个学生是否相同；
 * 3.改写toString方法，通过对象名输出该对象的相关信息(学号、姓名、年龄)。
 */
public class Student {
    String sno;
    String name;
    int age;

    //重写toString方法
    @Override
    public String toString() {
        return "学号:" + sno + ", 姓名:" + name + ", 年龄:" + age;
    }

    //equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sno.equals(student.sno);
    }

    //hashCode方法
    @Override
    public int hashCode() {
        return this.sno.hashCode();
    }

    public Student(String sno, String name, int age) {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student stu = new Student("001", "张三", 19);
        Student stu1 = new Student("002", "李四", 20);
        System.out.println(stu);
        System.out.println(stu1);
        if (stu.equals(stu1))
        {
            System.out.println("两个学生相同");
        }
        else
        {
            System.out.println("两个学生不相同");
        }
    }
}