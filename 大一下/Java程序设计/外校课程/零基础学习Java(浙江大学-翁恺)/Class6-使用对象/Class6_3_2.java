/**
 * 字符串操作
 * 字符串是对象,对它的所有操作都是通过"."这个运算符
 * 字符串.操作
 * 它表示对.左边的这个字符串做右边的那个操作
 * 这里的字符串可以是变量也可以是常量
 */
package Study;

import java.util.Locale;

public class Class6_3_2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcd";
        System.out.println(s1.compareTo(s2)); //比较两串字符串大小
        System.out.println("".compareTo(s2)); //比较两串字符串大小 .前也可以是一个常量

        String name = "Hellola",str1 = "one",str2 = "";
        System.out.println(name.length()); //输出字符串的长度
        System.out.println(str1.length());
        System.out.println(str2.length());

        //分别输出字符串里的内容
        s1 = "汉字";
        for (int i=0;i<s1.length();i++)
        {
            System.out.println(s1.charAt(i));
        }

        //得到子串
        s1 = "0123A56389汉字";
        System.out.println(s1.substring(2)); //23A56389汉字 从第二位开始取到结尾
        System.out.println(s1.substring(2,4)); //23 从第二位开始取,取到第4位

        //寻找字符
        System.out.println(s1.indexOf('4')); //-1 表示没有找到该字符
        System.out.println(s1.indexOf('A')); //4 表示字符'A'在第4个位置
        System.out.println(s1.indexOf("A56")); //4 表示字符串"A56"出现在第4个位置(起始位置)
        int loc = s1.indexOf('3');
        System.out.println(s1.indexOf('3')); //3 虽然有2个3,只能找到第一个3
        System.out.println(s1.indexOf('3',loc+1)); //7 从loc开始往后找3

        //转换大写
        String s3 = "abcd";
        System.out.println(s3.toUpperCase()); //ABCD 转换成大写字母
    }
}
