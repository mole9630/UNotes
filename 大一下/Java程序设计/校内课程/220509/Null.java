package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Null {
    public static void main(String[] args) {
        Map<String, String> m1 = new Hashtable<String, String>();
        m1.put("050901", "张三");
        m1.put("050902", "李四");
        m1.put("050903", "王五");
        try {
            m1.put("050904", null); //Hashtable中的键值对都不能为null
        } catch (Exception e) {
            System.out.println("存在异常:" + e.toString());
        }

        Set<String> st = m1.keySet();
        for (String s : st) {
            System.out.println(s + " " + m1.get(s));
        }
    }
}