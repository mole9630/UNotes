package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashDemo {
    public static void main(String[] args) {
        Set<StudentHash> st = new HashSet<StudentHash>();
        StudentHash s1 = new StudentHash("220502001","张三",19);
        StudentHash s2 = new StudentHash("220502002","李四",20);
        StudentHash s3 = new StudentHash("220502003","王五",19);
        StudentHash s4 = new StudentHash("220502004","钱六",18);
        StudentHash s5 = new StudentHash("220502005","赵七",21);
        StudentHash s6 = new StudentHash("220502006","孙八",19);
        StudentHash s7 = new StudentHash("220502007","周九",21);
        StudentHash s8 = new StudentHash("220502008","吴十",20);

        //往Set集合内添加数据
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add(s6);
        st.add(s7);
        st.add(s8);
        st.add(s8); //重复添加 -去重复值
        st.add(new StudentHash("220502008","吴十",20)); //重复添加 -不会去掉重复值 因不是一个对象
        st.add(new StudentHash("220502009","吴十",20)); //重写hashCode与equals方法后:姓名和年龄重复(不完全重复) 不去掉重复值
        st.add(new StudentHash("220502008","吴十",20)); //重写hashCode与equals方法后:学号,姓名和年龄重复(完全重复) 掉重复值

        //迭代器遍历
        System.out.println("***** 遍历(通过迭代器) *****");
        Iterator it = st.iterator();
        while (it.hasNext())
        {
            StudentHash obj = (StudentHash) it.next(); //往内添加的是Student类的对象,故不能在使用String
            System.out.println(obj);
        }
    }
}
