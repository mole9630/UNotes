package com;
/**
 * 如果一个类实现某个接口,该类不是抽象类,则必须实现接口中所有抽象方法(没有方法体的方法)
 */
public class Dog implements Animal {
    //实现接口中抽象方法
    public void eat()
    {
        System.out.println("Dog啃骨头");
    }
    public void walk()
    {
        System.out.println("Dog会跑步");
    }
    public void sleep()
    {
        System.out.println("Dog会休息");
    }
}
