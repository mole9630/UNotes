package com;

public class Dog extends Animal {
    //成员方法
    String name;
    //方法重写:子类中eat()方法重写了父中eat()方法
    //方法重写条件:
    public void eat(String food) //优先调用子类本类
    {
        //此处可添加其他方法
        System.out.println("Dog吃了个" + food);
    }

    //重写注解作用
    @Override
    public void walk(int bt)
    {
        System.out.println("Animal走了" + bt + "步");
    }

    //方法重写equals
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.eat("骨头");
        dg.walk(1000);
    }
}
