package com;

public class Animal <T> {
    private T name;
    private T color;

    public Animal() {
    }
    public Animal(T name, T color) {
        this.name = name;
        this.color = color;
    }

    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }
    public T getColor() {
        return color;
    }
    public void setColor(T color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Animal<String> a = new Animal<String>();
        a.setName("狗狗");
        a.setColor("white");
        System.out.println(a.getName() + "\n" + a.getColor());

        Animal<Integer> a1 = new Animal<Integer>();
        a1.setName(1234);
        a1.setColor(4321);
        System.out.println(a1.getName() + "\n" + a1.getColor());
    }
}
