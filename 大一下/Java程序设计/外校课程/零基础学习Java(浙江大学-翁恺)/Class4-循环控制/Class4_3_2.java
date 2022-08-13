/**
 * 求最大公约数
 * 枚举法:
 *      1 设i为2
 *      2 如果a和b都能被i整除,则记下这个i
 *      3 i+1后重复第二步,直到i等于a或b为止
 *      4 那么,曾经记下的最大的可以同时整除a和b的i就是gcd
 * 辗转相除法:
 *      1 如果b等于0,计算结束,a就是最大公约数
 *      2 否则,计算a除以b的余数,让a等于b,而b等于那个余数
 *      3 回到第一步
 */
package Study;

import java.util.Scanner;

public class Class4_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("**** 枚举法 ****");
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = 1;
        for (int i=2;i<=a && i<=b;i++)
        {
            if (a%i == 0 && b%i == 0)
            {
                gcd = i;
            }
        }
        System.out.println(a + "和" + b + "的最大公约数为:" + gcd);


        //辗转相除法
        System.out.println("**** 辗转相除法 ****");
        int c = in.nextInt();
        int d = in.nextInt();
        int oc = c;
        int od = d;
        while (b!=0)
        {
            int r = a%b;
            System.out.println(a + "," + b + "," + r); //运算过程
            a = b;
            b = r;
        }
        System.out.println(oc + "和" + od + "的最大公约数为:" + gcd);

    }
}
