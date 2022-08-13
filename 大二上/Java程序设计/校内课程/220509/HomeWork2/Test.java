package HomeWork;
/**
 @ THIS FILE IS PART OF mole9630 PROJECT
 @ Test.java - This is the java homework for May 14th
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //未重写hashcode和equals方法的Student1类
        Set<Student1> stu1 = new HashSet<Student1>();
        stu1.add(new Student1("s001","张三",18));
        stu1.add(new Student1("s002","李四",19));
        stu1.add(new Student1("s003","王五",20));
        stu1.add(new Student1("s003","王五",20));

        //重写hashcode和equals方法的Student2类
        Set<Student2> stu2 = new HashSet<Student2>();
        stu2.add(new Student2("s001","张三",18));
        stu2.add(new Student2("s002","李四",19));
        stu2.add(new Student2("s003","王五",20));
        stu2.add(new Student2("s003","王五",20));

        //遍历(未重写hashcode和equals方法)
        System.out.println("**** 遍历(未重写hashcode和equals方法) ****");
        Iterator it1 = stu1.iterator();
        while (it1.hasNext())
        {
            Student1 obj = (Student1) it1.next();
            System.out.println(obj);
        }

        //遍历(重写hashcode和equals方法)
        System.out.println("\n**** 遍历(重写hashcode和equals方法) ****");
        Iterator it2 = stu2.iterator();
        while (it2.hasNext())
        {
            Student2 obj = (Student2) it2.next();
            System.out.println(obj);
        }
    }
}
