package com;

import java.util.Objects;

public class ObjectClass {
    String name;

    //自动生成
    @Override
    public String toString() {
        return "ObjectClass{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectClass that = (ObjectClass) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        ObjectClass oc1 = new ObjectClass();
        ObjectClass oc2 = new ObjectClass();
        System.out.println(oc1.equals(oc2)); //false
        System.out.println("oc1=" + oc1 + "\noc2=" + oc2); //输出地址
        oc1 = oc2;
        System.out.println(oc1.equals(oc2)); //true
        System.out.println("oc1=" + oc1 + "\noc2=" + oc2); //输出地址
        System.out.println("\n**** ****");
        oc1.name = "张三";
        System.out.println(oc1);
        System.out.println(oc1.toString());
        System.out.println(oc1.hashCode());
    }
}
