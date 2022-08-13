/**
 * 编程实现:利用String类的常用方法判断从键盘输入的用户名和密码是否正确,并给出相应提示信息。
 * 假设用户名为admin,密码为：123456
 */

/
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入账号:");
            String username = in.next(); //输入账号
            System.out.println("请输入密码:");
            String password = in.next(); //输入密码
            if (!username.equals("admin"))
            {
                System.out.println("账号错误,请重新登录!\n");
                continue; //结束本次循环,重新输入账号密码
            }
            else if (!password.equals("123456"))
            {
                System.out.println("密码错误,请重新登录!\n");
                continue; //结束本次循环,重新输入账号密码
            }
            else
            {
                break; //结束循环,跳出登录程序
            }
        }
        System.out.println("登录成功!");
    }
}