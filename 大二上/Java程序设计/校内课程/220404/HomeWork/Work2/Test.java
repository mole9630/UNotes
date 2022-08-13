package Work2;
/*
@ THIS FILE IS PART OF mole9630 PROJECT
@ Test.java - This is the java homework for April 6th
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top
*/
public class Test {
    public static void main(String[] args) {
        Student info_stu = new Student("张三",19); //实例化Student类
        Undergraduate info_degree = new Undergraduate("李四",20,"学士"); //实例化Undergraduate类

        //调用打印学生信息的方法(info_stu)
        System.out.println("**** 打印info_stu内的学生信息 ****"); //分隔符
        info_stu.show();

        //调用打印学生信息的方法(info_degree)
        System.out.println("\n**** 打印info_degree内的学生信息 ****"); //分隔符
        info_degree.show();

        //判断该学生和另一个学生对象是否相等
        System.out.println("\n**** 判断两个对象是否相等 ****"); //分隔符
        if (info_stu.equals(info_degree))
        {
            System.out.println("\"info_stu\"与\"info_degree\"学生对象判断结果为:相等");
        }
        else
        {
            System.out.println("\"info_stu\" 与 \"info_degree\" 学生对象判断结果为:不相等");
        }
    }
}