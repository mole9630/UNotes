/**
 * 计数循环
 * 通过count得知循环跑了多少轮
 * 如果要模拟运行一个很大次数的循环,可以模拟较少的循环次数,然后做出推断
 */
package Study;

import java.util.Scanner;

public class Class3_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 100;
        while(count >= 0) //如果>=改为= 结果也会发生改变
        {
            count = count - 1; //如果交换位置 结果也会发生改变
            System.out.println(count); //如果交换位置 结果也会发生改变
        }
        System.out.println("end-count=" + count);
        System.out.println("**** end ****");
    }
}
