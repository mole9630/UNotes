package com;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudent {
    public static void main(String[] args) {
        Set<StudentTree> st = new TreeSet<StudentTree>();

        StudentTree s1 = new StudentTree("张三",19);
        StudentTree s2 = new StudentTree("李四",20);
        StudentTree s3 = new StudentTree("王五",19);
        StudentTree s4 = new StudentTree("钱六",18);
        StudentTree s5 = new StudentTree("赵七",21);
        StudentTree s6 = new StudentTree("孙八",19);
        StudentTree s7 = new StudentTree("周九",17);
        StudentTree s8 = new StudentTree("吴十",20);

        //往Set集合内添加数据
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add(s6);
        st.add(s7);
        st.add(s8);

        //迭代器遍历
        System.out.println("***** 遍历(通过迭代器) *****");
        Iterator it = st.iterator();
        while (it.hasNext())
        {
            StudentTree obj = (StudentTree) it.next(); //往内添加的是Student类的对象,故不能在使用String
            System.out.println(obj);
        }
    }
}
