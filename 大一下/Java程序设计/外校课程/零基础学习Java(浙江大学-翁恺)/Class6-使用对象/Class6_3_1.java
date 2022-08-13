/**
 * 字符串常量
 * String是一个类,String的变量是对象的管理者而非所有者
 * 就像数组变量是数组的管理者而非所有者一样
 */
package Study;

import java.util.Scanner;

public class Class6_3_1 {
    public static void main(String[] args) {
        String s = new String("Hello"); //创建了一个String的对象,用"Hello"初始化这个对象
        System.out.println(s + " world"); //Hello world
        System.out.println(s + 12 + 23); //Hello1223
        System.out.println(s + (12+23)); //Hello35
        Scanner in = new Scanner(System.in);
        String a;
        a = in.next(); //读入一个单词,单词的标志是空格(空格包括空格,tab和换行)
        s = in.nextLine(); //读入一整行
        System.out.println(a);
        System.out.println(s);
        System.out.println(s.equals("bye")); //比较两个字符串是否一致

    }
}
