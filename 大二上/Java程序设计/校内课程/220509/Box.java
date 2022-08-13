package com;

public class Box {
    public static void main(String[] args) {
        Integer t1 = 123; //将缺省int类型转换为Integer类类型--装箱
        System.out.println(t1);
        int t2 = 123;
        System.out.println(t2);
        int t3 = t1; //将Integer类型转换为int类型--拆箱
        System.out.println(t3);
    }
}
