/**
 * 整数的分解
 * 一个整数是由1至多位数字组成的,如何分解出整数的各个位上的数字,然后加以计算
 * 对一个整数做%10的操作,就得到了它的个位数
 * 对一个整数做/10的操作,就去掉了它的个位数
 * 然后再对2的结果做%10,就得到原来数的十位数
 */
package Study;

import java.util.Scanner;

public class Class3_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        number = in.nextInt();
        int result = 0;
        do
        {
            int digit = number % 10;
            result = result*10+digit;
            System.out.print(digit);
            number = number / 10;
        }while (number > 0);
        System.out.println();
        System.out.println(result);
    }
}
