package com;

public class Dog extends Animal { //Dog继承Animal
    String color = "红色-Dog"; //注释掉该行则显示"基色-Animal(父类)"
    Dog(){
//        super(); //等同于写了该行 相当于调用父类中无参构造方法
        System.out.println("Dog的颜色:" + this.color); //Dog的颜色:红色-Dog 调用父类中的构造方法 或直接color调用本类中的成员变量
        System.out.println("Dog的颜色:" + super.color); //Dog的颜色:基色-Animal(父类) super.color调用父类中的成员变量
    }

    Dog(int weight, int height, String color) {
        this(); //调用本类的其他构造方法 -对应无参构造
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    void show() //子类与父类有相同方法时,子类的方法覆盖了父类的方法
    {
        super.show(); //调用父类的show()方法
        System.out.println("Dog的重量:" + weight + "\nDog的高度:" + height + "\nDog的颜色:" + color);
    }

    public static void main(String[] args) {
        Dog dog = new Dog(); //先调用父类中无参构造方法,再调用子类无参构造方法
        System.out.println(dog.color); //输出的是子类中的同名变量,父类中的同名变量被隐藏
        System.out.println(dog.weight);
        /**
         * 基于父类创建子类时,子类可以继承父类的成员变量和成员方法
         * 在父类和子类中同时声明了一个同名变量,这两个变量在程序运行的同时存在
         * 也就是说子类在使用父类的同名变量时,父类中的同名变量只是被隐藏了.
         */
        System.out.println("\n**** dog.show ****");
        dog.show();
        System.out.println("\n**** 实例化后 ****");
        Dog dog2 = new Dog(29,30,"蓝色");
        dog2.show(); //调用子类的方法,父类相同方法被覆盖
    }
}