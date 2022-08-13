/**
 * 数数字
 */
package Study;

import java.util.Scanner;

public class Class3_1_2 {
    public static void main(String[] args) {
        /**
         * 一个程序要读入一个正整数,然后输入这个整数的位数
         */
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        while (number>0)
        {
            number = number / 10;
            count = count + 1;
        }
        System.out.println(count + "位数");
    }
}
