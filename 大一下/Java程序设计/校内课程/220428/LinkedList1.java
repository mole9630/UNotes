package com;

import java.util.Iterator;
import java.util.LinkedList;

class Dog {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

public class LinkedList1 {

    public static void main(String[] args) {
        Dog d1 = new Dog("小白","white");
        Dog d2 = new Dog("花花","colorful");
        LinkedList k1 = new LinkedList();
        //增加元素
        k1.add("狗狗系列");
        k1.add(d1);
        k1.add(d2);
        System.out.println(k1.getFirst());
        System.out.println(k1.get(1));
        k1.remove(d1);


        //遍历元素-链表
        Iterator iterator = k1.iterator();
        while (iterator.hasNext())
        {
            Object obj = iterator.next();
            System.out.println(obj.toString());
        }
    }
}
