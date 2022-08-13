package com;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        System.out.println("**** replaceAll ****");
        String s1 = "f4v1df581fvwe48f51f";
        String s2 = s1.replaceAll("\\d+","_"); //所有数字用下划线替代
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("\n**** split ****");
        String[] s3 = s1.split("\\d+"); //遇到数字即分开
        for (String s:s3)
        {
            System.out.print(s + " ");
        }

        System.out.println("\n\n**** matches ****");
        boolean b1 = s1.matches("\\d+"); //matches为全匹配
        if(b1) //false 不匹配
        {
            System.out.println("匹配");
        }
        else
        {
            System.out.println("不匹配");
        }

        System.out.println("\n**** 实例-从键盘输入,验证手机号是否合法 ****");
        Scanner in = new Scanner(System.in);
        String phone = in.next();
        String regex = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";
        boolean flag = phone.matches(regex);
        if (flag)
        {
            System.out.println("手机号合法");
        }
        else
        {
            System.out.println("手机号不合法");
        }
    }
}
