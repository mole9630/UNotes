package com;


import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        int zm = 0,kg = 0,sz = 0,other = 0;
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)>='0'&&s1.charAt(i)<= '9')
            {
                sz++;
            }
            else if (s1.charAt(i)>=65 && s1.charAt(i)<= 90)
            {
                zm++;
            }
            else if (s1.charAt(i)>=97 && s1.charAt(i)<= 122)
            {
                zm++;
            }
            else if (s1.charAt(i)==32)
            {
                kg++;
            }
            else
            {
                other++;
            }
        }
        System.out.println("字母有:" + zm + "个,数字有:" + sz + "个,空格有:" + kg + "个,其他字符有:" + other + "个");
    }
}
