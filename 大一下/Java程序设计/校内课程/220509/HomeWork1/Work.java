package HomeWork;
/**
 @ THIS FILE IS PART OF mole9630 PROJECT
 @ Work.java - This is the java homework for May 10th
 @ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
 @ Copyright (c) 2022 mole9630(Github)
 @ www.mole9630.top | me@mole9630.top

 * 编程实现：选择合适的Map集合保存5位学员的学号和姓名，然后按学号的自然顺序将这些键值对一一打印出来。提示：
 * 1.创建TreeMap集合。
 * 2.使用put()方法将学号(“1”、“2”、“3”、“4”、“5”)和姓名(“Lucy”、“John”、“Smith”、“Aimee”、“Amanda”)存储到Map中，存的时候可以打乱顺序观察排序后的效果。
 * 3.使用 map.keySet()获取键的Set集合。
 * 4.使用Set集合的iterator()方法获得Iterator对象用于迭代键。
 * 5.使用Map集合的get()方法获取键所对应的值。
 * 6.从键盘输入一个学号，删除该学号的学生信息，再打印Map中的键值对。
 */

import java.util.*;

public class Work {
    public static void main(String[] args) {
        TreeMap<String,String> m1 = new TreeMap<String,String>();
        //添加数据
        m1.put("1","Lucy");
        m1.put("5","Amanda");
        m1.put("3","Smith");
        m1.put("2","John");
        m1.put("4","Aimee");

        //获取键的Set集合
        System.out.println("***** 获取键的Set集合 *****");
        Set<String> st = m1.keySet();
        Iterator it = st.iterator();
        while (it.hasNext()){
            String k = (String)it.next();
            String v = (String)m1.get(k);
            System.out.println("学号:"+ k + " 姓名:" + v);
        }

        //获取键所对应的值
        System.out.println("\n***** 获取键所对应的值 *****");
        Collection<String> c1 = m1.values(); //值
        for (String s : c1) {
            System.out.println(s);
        }

        //删除指定的学生信息再输出键值对
        System.out.println("\n***** 对学生删除功能 *****");
        System.out.print("\n请输入一个学号：");
        Scanner in = new Scanner(System.in);
        String sno = in.next();
        m1.remove(sno);
        Set<String> st1 = m1.keySet();
        for (String s : st1) {
            String v = m1.get(s); //取值
            System.out.println("学号:" + s + ",姓名:" + v);
        }
    }
}
