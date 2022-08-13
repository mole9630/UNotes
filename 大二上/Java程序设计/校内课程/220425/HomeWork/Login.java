/**
 * 正则表达式的应用，编程实现：
 * 1.从键盘上输入一个用户名和密码；
 * 2.要求：用户名只能是数字、字母字符，且长度为6到10位；
 * 3.密码为6位数字字符；
 * 4.运行测试。
 */

/
package Work;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入账号:");
            String username = in.next(); //输入账号
            System.out.println("请输入密码:");
            String password = in.next(); //输入密码
            String regex_username = "^[a-zA-Z0-9]{6,10}$";
            String regex_password = "^[0-9]{6}$";
            if (!username.matches(regex_username))
            {
                System.out.println("账号输入不合法,请重新登录!\n");
                continue; //结束本次循环,重新输入账号密码
            }
            else if (!password.matches(regex_password))
            {
                System.out.println("密码输入不合法,请重新登录!\n");
                continue; //结束本次循环,重新输入账号密码
            }
            else
            {
                System.out.println("登录成功!");
                break; //结束循环,跳出登录程序
            }
        }
    }
}
