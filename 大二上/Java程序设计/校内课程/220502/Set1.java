package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        //Set是无序存储,不可重复(即去重复值)
//        Set st = new HashSet();
        Set<String> st = new HashSet<String>();
        //添加元素
        st.add("蚌埠 <-> 淮北");
        st.add("合肥 <-> 芜湖");
        st.add("蚌埠 <-> 淮北"); //重复值
        st.add("芜湖 <-> 蚌埠");
        st.add("蚌埠 <-> 淮北"); //重复值
        //遍历(输入是无序的)
        System.out.println("**** 遍历 ****");
        for (Object obj:st)
        {
            System.out.println(obj);
        }
        //遍历(通过迭代器)
        System.out.println("\n**** 遍历(通过迭代器) ****");
        Iterator it = st.iterator();
        while (it.hasNext())
        {
            String obj = (String) it.next();
            System.out.println(obj);
        }
    }
}
