package Work220407_1;
/*
@ THIS FILE IS PART OF mole9630 PROJECT
@ Test.java - This is the java homework for April 8th
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top

* 请按照以下要求设计一个学生类Student，并进行测试。要求如下：
* 1.Student类中包含姓名、成绩两个属性。
* 2.分别给这两个属性定义两个方法，一个方法用于设置值，另一个方法用于获取值。
* 3.Student类中定义一个无参的构造方法和一个接收两个参数的构造方法，两个参数分别为姓名和成绩属性赋值。
* 4.在测试类中创建两个Student对象，一个使用无参的构造方法，然后调用方法给姓名和成绩赋值，一个使用有参的构造方法，在构造方法中给姓名和成绩赋值。
* 5.输出两个Student对象的信息。
*/
public class Test {
    public static void main(String[] args) {
        Student stuWithOut = new Student(); //调用无参构造方法
        stuWithOut.stuSetInfo("张三",98.5); //利用"stuSetInfo"赋值
        stuWithOut.stuGetInfo(); //利用"stuGetInfo"打印学生信息
        
        System.out.println("\n**** 分隔符 ****\n");

        Student stuWith = new Student("李四",94.5); //调用有参构造方法
        stuWith.stuGetInfo(); //利用"stuGetInfo"打印学生信息
    }
}
