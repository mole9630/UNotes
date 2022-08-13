package Work;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName = in.next();
        String password = in.next();
        if(userName.trim().equals("admin"))
        {
            System.out.println("用户名正确");
            if (password.trim().equals("123456"))
            {
                System.out.println("用户信息正确,登录成功!");
            }
            else
            {
                System.out.println("密码错误,请重新输入!");
            }
        }
        else
        {
            System.out.println("用户名错误,请重新输入!");
            //用户名错误时,无需再判断密码
        }
    }
}
