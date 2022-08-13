/**
 * 定义函数
 *
 * 什么是函数:
 *  函数是一段代码,接收零个或多个参数,做一件事情,并返回零个或一个值.
 */
package Study;

import java.util.Scanner;

public class Class7_1_1 {
    public static boolean isPrime(int i) //构造判断素数的函数
    {
        //判断是否是素数
        boolean isPrime = true;
        for(int k=2;k<i;k++)
        {
            if(i%k==0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void sum(int a, int b) //函数头 void表示返回类型,sum为函数名
    { //函数体
        int i;
        int sum1 = 0;
        for(i=a;i<=b;i++)
        {
            sum1 += i;
        }
        System.out.println(a + "到" + b + "的和为:"+sum1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        if(n==1) m=2;
        int cnt = 0;
        int sum = 0;
        for(int i=m;i<=n;i++)
        {

            if(isPrime(i))
            {
                cnt++;
                sum+=i;
            }
        }
        System.out.println("在"+m+"到"+n+"之间的素数有"+cnt+"个，其和为"+sum);


        //求和
        System.out.println("\n**** 求和 ****");
        sum(1,10);
        sum(20,30);
        sum(35,45);
    }
}
