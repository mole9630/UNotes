/**
 * do-while循环
 * 在进入循环的时候不做检查,而是在执行完一轮循环体的代码后,再来检查循环的条件是否满足,如果满足则继续下一轮循环,不满足则循环结束。
 */
package Study;

import java.util.Scanner;

public class Class3_1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        do
        {
            number = number / 10;
            count = count + 1;
            System.out.println("number=" + number + ";count=" + count);
        }while ( number >0); //while后的分号不能丢,表示该do-while结束了.
        System.out.println(count);
    }
}
