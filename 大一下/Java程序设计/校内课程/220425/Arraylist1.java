package com;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {
        System.out.println("**** add ****");
        List t1 = new ArrayList();
        t1.add("张三");
        t1.add("李四");
        System.out.println(t1); //[张三, 李四]
        t1.add(1,"王五"); //在索引号1的位置增加一个王五
        System.out.println(t1); //[张三, 王五, 李四]
        List t2 = new ArrayList();
        t2.add("赵一");
        t2.add("钱二");
        t1.addAll(t2); //在t1的末端按顺序添加t2集合内的全部数据
        System.out.println(t1); //[张三, 王五, 李四, 赵一, 钱二]
        System.out.println(t1.get(1)); //王五 获取t1中索引号为1的数据
        for (int i=0;i<t1.size();i++) //利用索引号遍历 集合内用size(),而非length()
        {
            System.out.print(t1.get(i) + " ");
        }

        System.out.println("\n\n**** remove ****");
        t1.remove(1); //删除索引号为1的数据
        System.out.println(t1); //[张三, 李四, 赵一, 钱二] 删除了索引号为1的王五

        System.out.println("\n**** set ****");
        t1.set(1,"王六"); //修改索引号为1的数据
        System.out.println(t1); //[张三, 王六, 赵一, 钱二] 索引号为1的王五修改为王六

        System.out.println("\n**** remove ****");
        t1.add("赵一");
        System.out.println(t1); //[张三, 王六, 赵一, 钱二, 赵一]
        System.out.println(t1.indexOf("赵一")); //2 从前往后寻找首次出现赵一的索引号
        System.out.println(t1.lastIndexOf("赵一")); //4 从后往前寻找首次出现赵一的索引号
    }
}
