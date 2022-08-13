package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {
    public static void main(String1[] args) {
        System.out.println("**** Pattern ****");
        String s1 = "sdfk5oxf12324e;'3453254dfsz7dfsxc";
        Pattern p1 = Pattern.compile("\\d+");
        String s2[] = p1.split(s1);
        for (String s:s2)
        {
            System.out.print(s + " ");
        }

        System.out.println("\n\n**** matches ****");
        boolean b1 = Pattern.matches("\\d+","656896dfc48dczwdc485"); //返回一个布尔值,matches是全部匹配
        System.out.println(b1); //false
        boolean b2 = Pattern.matches("\\d+","4451132452452442"); //返回一个布尔值,matches是全部匹配,即必须全部是数字
        System.out.println(b2); //true

        System.out.println("\n**** Matcher ****");
        Matcher m1 = p1.matcher("62620485");
        System.out.println("p:" + m1.pattern()); //p:\d+

        System.out.println("\n**** 实例-判断从键盘输入的是否为全数字字符 ****");
        Scanner in = new Scanner(System.in);
        String str = in.next(); //接收输入的字符串
//        Pattern p2 = Pattern.compile("\\d+"); //正则表达式
        String regex = "\\d+";
        boolean bone = Pattern.matches(regex,str);
        if(bone)
        {
            System.out.println("匹配");
        }
        else
        {
            System.out.println("不匹配");
        }

        System.out.println("\n**** 实例-判断从键盘输入的是否满足6位数字 ****");
        String password = in.next();
        String regex_p = "^\\d{6}$";
        boolean flag = Pattern.matches(regex_p,password);
        if(flag)
        {
            System.out.println("匹配");
        }
        else
        {
            System.out.println("不匹配");
        }
    }
}
