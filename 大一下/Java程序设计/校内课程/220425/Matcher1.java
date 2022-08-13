package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher1 {
    public static void main(String1[] args) {
        System.out.println("**** matches(必会) ****");
        Pattern p1 = Pattern.compile("[0-9]{6}"); //6位数字
        Matcher m1 = p1.matcher("123456");
        Matcher m2 = p1.matcher("123456abc");
        System.out.println(m1.matches()); //true
        System.out.println(m2.matches()); //false

        System.out.println("\n**** lookingAt ****"); //只查找前面的匹配结果
        System.out.println(m1.lookingAt()); //true
        System.out.println(m2.lookingAt()); //true
        Matcher m3 = p1.matcher("aaa123456");
        System.out.println(m3.lookingAt()); //false

        System.out.println("\n**** find ****");
        m3.find();
        System.out.println("字符串任何位置是否匹配:" + m3.find()); //false
    }
}
