package Study;

import java.util.Scanner;

public class Class4_2_2_k {
    public static void main(String[] args) {
        //邮资邮票问题
        Scanner in = new Scanner(System.in);
        System.out.print("请输入邮资多少元:");
        double amount = in.nextDouble();
        for (int a=0;a<=amount;++a)
        {
            for (int b=0;b<=amount;++b)
            {
                for (int c=0;c<=amount;++c)
                {
                        if (a*0.8 + b*1.2 + c*1.5 == amount)
                        {
                            System.out.println(a + "张0.8元," + b + "张1.2元," + c + "张1.5元-->" + amount + "元");
//                            break; //如果只需要一个答案
                        }
                        else
                        {
                            System.out.println("无法凑出刚好邮资为" + amount + "元的邮票");
                        }
                }
            }
        }
    }
}
