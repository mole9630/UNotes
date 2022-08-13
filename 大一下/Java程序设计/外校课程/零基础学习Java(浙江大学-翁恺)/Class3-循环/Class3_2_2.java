/**
 * 算平均数
 * 让用户输入一系列的正整数,最后输入-1表示输入结束,然后程序计算出这些数字的平均数,输出输入的数字的个数和平均数
 *     每读一个数,就把它加到一个累加的变量里,到全部数据读完,再拿它去除读到的数的个数即可
 */
package Study;

import java.util.Scanner;

public class Class3_2_2 {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
//        number = in.nextInt();
//        while (number != -1)
//        {
//            sum = sum + number;
//            count = count + 1;
//            number = in.nextInt();
//        }
        do
        {
            number = in.nextInt();
            if (number != -1) //判断一开始输入的数是否为-1
            {
                sum = sum + number;
                count = count + 1;
            }
        }while (number != -1);
        if (count>0)
        {
            System.out.println("平均数为:" + (double) sum / count);
        }
    }
}
