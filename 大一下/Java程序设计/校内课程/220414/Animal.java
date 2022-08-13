package com;

public class Animal {
    //成员变量
    String color = "red";

    //成员方法
    void test()
    {
        class Test //局部内部类不能用public修饰局部内部类 -注意作用域:只在方法体内
        {

        }
    }

    void show()
    {
        System.out.println("我是一只"+color+"的动物");
    }

    //定义类 -内部类(也称为成员内部类)
    public static class Dog //内部类 静态内部类
    {
        String dogColor = "blue";

        void show()
        {
            System.out.println("我是一只"+dogColor+"的狗");
        }
        public static void main(String[] args) {
            Dog d1 = new Dog();
            Animal a1 = new Animal();
            System.out.println("Dog的颜色是" + a1.color); //red -在内部类中,使用外部类的对象调用成员
            d1.show();
        }
    }

    public class Cat { //成员内部类
        String catColor = "orange";
        void show()
        {
            System.out.println("我是一只" + Animal.this.color + "的猫"); //通过内部类访问外部类的成员变量
        }
    }

    public static void main(String[] args) {
        Animal a2 = new Animal();
        Dog d2 = new Dog();
        System.out.println("Dog的颜色是" + d2.dogColor); //blue -通过外部类访问静态内部类成员时,可以跳过外部类直接访问静态内部类
        Animal.Dog ad = new Animal.Dog(); //访问静态内部类成员
        System.out.println("Dog的颜色是" + ad.dogColor); //blue
        Animal.Cat ac = new Animal().new Cat(); //创建内部类对象
        ac.show(); //red
        System.out.println("Cat的颜色是" + ac.catColor); //orange -访问成员内部类
    }
}
