package com;
/**
 * 如果一个类实现接口,且该类没有实现接口中的所有抽象方法,那么类必须被声明为抽象方法类
 */
public abstract class Cat implements Animal {
    // 抽象的类不能实例化所以不能输出
    public void eat()
    {
        System.out.println("Cat吃鱼");
    }
    public void walk()
    {
        System.out.println("Cat会跑步");
    }
    public void sleep()
    {
        System.out.println("Cat会休息");
    }
}
