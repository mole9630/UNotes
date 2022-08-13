package com;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set st = new TreeSet();
        st.add(180);
        st.add(169);
        st.add(157);
        st.add(169);
        st.add(185);

        //遍历(通过迭代器)
        System.out.println("**** 遍历(通过迭代器) ****");
        Iterator it = st.iterator();
        while (it.hasNext())
        {
            Integer obj = (Integer) it.next();
            System.out.println(obj);
        }
    }
}