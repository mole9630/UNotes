package Study.Work220412_1;
/**
@ THIS FILE IS PART OF mole9630 PROJECT
@ Fish.java - This is the java homework for April 12th
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top

* 按以下要求编写程序
* 1 编写Animal接口，接口中声明run()方法。
* 2 定义Bird类和Fish类实现Animal接口。
* 3 编写测试类测试程序，定义Bird和Fish类对象，并调用其中的run()方法。
*/
public class Fish implements Animal{
    public void run()
    {
        System.out.println("调用Fish方法成功!");
    }
}
