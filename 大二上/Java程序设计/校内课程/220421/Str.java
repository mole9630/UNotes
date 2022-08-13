、package com;

import java.net.StandardSocketOptions;
import java.util.Calendar;
import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = "Hello";
        String s3 = new String(s2); //使用已经定义的字符串
        String s4 = new String("Hello World!");
        char[] c1 = {'a','b','c','d'};
        String s5 = new String(c1);
        String s7 = "hello world Hello everybody Hello hello world";

        //输出
        System.out.println("**** 字符串的输出 ****");
        Syste11m.out.println(s1); //Hello World!
        System.out.println(s1.toString()); //Hello World!
        System.out.println(c1); //abcd
        System.out.println(c1.toString()); //[C@4554617c

        //字符串连接
        System.out.println("\n**** 字符串的连接 ****");
        System.out.println("s1字符串的值为:" + s1);
        String s6 = s1.concat(s2); //连接s1与s2的字符串 -连接作为返回值(return),s1不受影响
        System.out.println("s1字符串的值为:" + s1); //连接后,s1的值不受连接的影响
        System.out.println("s6字符串的值为:" + s6);

        //字符串比较(equals比较的是字符串的内容)
        System.out.println("\n**** 字符串的比较 ****");
        System.out.println(s2 + "==" + s3);
        System.out.println(s2.equals(s3)); //true 比较的是字符串的内容
        System.out.println(s2==s3); //false 对象的引用地址不同(比较的是引用地址)

        //equalsIgnoreCase方法(字符串的比较-忽略大小写)
        System.out.println("\n**** 字符串的equalsIgnoreCase方法 ****");
        System.out.println(s2.equalsIgnoreCase("hello")); //true

        //compareTo方法(按字典顺序与参数s指定的字符串比较大小,相同返回0,对象大于s返回正值,对象小于s返回负值)
        System.out.println("\n**** 字符串的compareTo方法 ****");
        System.out.println(s2.compareTo("hello")); //-32
        System.out.println(s2.compareTo(s3)); //0
        System.out.println(s2.compareTo("Ha")); //4

        //字符串检索(检索不到返回0,检索到返回首次出现检索内容的索引号)
        System.out.println("\n**** 字符串的检索 ****");
        System.out.println(s7.indexOf("Hello")); //12 第十三个字符,索引号为12
        System.out.println(s7.indexOf("Hello1")); //-1 检索不到则返回-1
        System.out.println(s7.lastIndexOf("Hello")); //34 从后往前检索
        System.out.println(s7.lastIndexOf('h')); //34 单个字符检索(用单引号)
        System.out.println(s7.lastIndexOf('H')); //28 单个字符检索(用单引号)

        //字符串截取
        System.out.println("\n**** 字符串的截取 ****");
        System.out.println(s1.substring(6,11));

        //实例-从键盘输入身份证号,获取该人的年龄(仅考虑年份)
        System.out.println("\n**** 实例-从键盘输入身份证号,获取该人的年龄 ****");
        System.out.println("请输入身份证号:");
        Scanner in = new Scanner(System.in);
        String id_number=in.next(); //输入身份证号
        String birthday = id_number.substring(6,10); //取出身份证号的年份
        int year = Integer.parseInt(birthday); //将String类型转为int型
        int age = 2022 - year;
        System.out.println(age);

        //拓展-获取当前时间
        System.out.println("\n**** 拓展-获取当前时间 ****");
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int years = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int doy = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println("当期时间: " + cal.getTime());
        System.out.println("日期: " + day);
        System.out.println("月份: " + month);
        System.out.println("年份: " + years);
        System.out.println("一周的第几天: " + dow);  // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
        System.out.println("一月中的第几天: " + dom);
        System.out.println("一年的第几天: " + doy);

        //字符串大小写转换
        System.out.println("\n**** 字符串的大小写转换 ****");
        System.out.println(s2.toLowerCase()); //转换为小写

        //字符串替换
        System.out.println("\n**** 字符串的替换 ****");
        String s8 = s1.replace("World","Kitty"); //将world替换成Kitty 只替换首次检索到的
        System.out.println(s1); //Hello World! 替换不会导致s1变化
        System.out.println(s8); //Hello Kitty!
        String s9 = s7.replaceAll("world","Kitty"); //全部替换
        System.out.println(s9); //hello Kitty Hello everybody Hello hello Kitty

        //字符串去除空格
        //实例-从键盘输入用户名,判断是否为"admin",输出相应的信息
        System.out.println("\n**** 字符串去除空格 ****");
        System.out.println("*** 实例-从键盘输入用户名,判断是否为\"admin\",输出相应的信息 ***");
        String username = in.next();
        if (username.trim().equals("admin")) //trim:移除字符串两侧的空格
        {
            System.out.println("用户名正确");
        }
        else
        {
            System.out.println("用户名错误");
        }

        //字符串转化相应数值
        System.out.println("\n**** 字符串转化相应数值 ****");
        String s10 = "1234";
        System.out.println(Integer.parseInt(s10) + 1); //1235
        System.out.println(Integer.valueOf(s10) + 1); //1235

        //回文字符串
        System.out.println("\n**** 检测字符串是否为回文串 ****");
        String test = in.next();
        int left = 0,right = test.length()-1;
        boolean flag = true;
        while (left<right)
        {
            if (test.charAt(left)==test.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                flag = false;
                break;
            }
        }
        if (flag)
        {
            System.out.println("是回文字符串");
        }
        else
        {
            System.out.println("不是回文字符串");
        }
    }
}