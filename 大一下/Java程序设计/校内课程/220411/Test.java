package com;

public abstract class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat(); //使用接口类型的引用变量来实现接口的类的实例对象的方法
    }
}
