package com;

import java.util.Iterator;
import java.util.LinkedList;

public class Generics {
    public static void main(String[] args) {
        LinkedList t1 = new LinkedList();
        t1.add("Hello");
        t1.add("World");
        t1.add(123);

        Iterator it = t1.iterator();
        while (it.hasNext())
        {
//            Object obj = it.next();
            String obj = (String) it.next();
            System.out.println(obj);
        }
    }
}