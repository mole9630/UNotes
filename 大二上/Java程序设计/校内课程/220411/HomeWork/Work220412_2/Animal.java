package Study.Work220412_2;
/**
@ THIS FILE IS PART OF mole9630 PROJECT
@ Animal.java - This is the java homework for April 12th
@ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
@ Copyright (c) 2022 mole9630(Github)
@ www.mole9630.top | me@mole9630.top

* 按以下要求编程程序。
* 1 编写一个抽象类Animal，其成员变量有name，age，weight表示动物名、年龄和重量。方法有showInfo( )、move( )和eat( )，其中后面两个方法是抽象方法。
* 2 编写一个类Bird继承Animal，实现相应的方法。通过构造方法给name，age，weight分别赋值，showInfo( )打印鸟名、年龄和重量，move( )方法打印鸟的运动方式，eat( )打印鸟喜欢吃的食物。
* 3 编写测试类TestAnimal，用Animal类型的变量，调用Bird对象的三个方法。
*/
public abstract class Animal {
    String name; //动物名
    int age; //年龄
    double weight; //重量

    //无参数构造方法
    public Animal(){
    }

    //有参数构造方法
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void showInfo() {
    }
    public abstract void move();
    public abstract void eat();
}
