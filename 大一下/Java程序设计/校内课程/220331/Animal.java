package com;

public class Animal {
    int weight;
    int height;
    String color = "基色-Animal(父类)";

    public Animal(int weight, int height, String color) {
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    Animal() //无参构造方法
    {
        System.out.println("Animal的颜色:" + color);
    }

    void show() //显示信息的构造方法
    {
        System.out.println("Animal的重量:" + weight + "\nAnimal的高度:" + height + "\nAnimal的颜色:" + color);
    }
}