/**
 * 多重循环(嵌套循环),凑硬币问题
 */
package Study;

import java.util.Scanner;

public class Class4_2_2 {
    public static void main(String[] args) {
        //100以内的素数
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        for (int n=2;n<100;n++)
        {
            int isPrime = 1;
            for (int i=2;i<n;i++)
            {
                if (n%i == 0)
                {
                    isPrime = 0;
                    break;
                }
            }
            if (isPrime == 1)
            {
                System.out.print(n + " ");
            }
        }


        //凑硬币问题(如何用1元,5元,10元,20元凑出amount以下的金额)
        /**
         * 在循环前可以放一个标号在标示循环:label
         * 带标号的break和continue对那个循环起作用
         */
        System.out.println("\n**** 凑硬币问题 ****");
        int amount = in.nextInt();
        OUT: //标号
        for (int one=0;one<=amount;++one)
        {
            for (int five=0;five<=amount;++five)
            {
                for (int ten=0;ten<=amount;++ten)
                {
                    for (int twenty=0;twenty<=amount/20;++twenty)
                    {
                        if (one + five*5 + ten*10 + twenty*20 == amount)
                        {
                            System.out.println(one + "张1元," + five + "张5元," + ten + "张10元," + twenty + "张20元-->" + amount);
                            break OUT; //如果只需要一个答案
                        }
                    }
                }
            }
        }
    }
}
