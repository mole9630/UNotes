/**
 * for循环
 * for(初始化;条件;单步动作)
 * {
 *     循环体
 * }
 * 第一部分是一个初始化,可以定义一个新的变量:int count=10或者直接赋值:i=10
 * 第二部分是循环维持的条件,这个条件是先检验的,与while循环一样,进入循环之前,首先要检验条件是否满足,条件满足才执行循环,条件不满足就结束循环
 * 第三部分是步进,即每轮执行了循环体之后,必须执行的表达式.通常我们在这里改变循环变量,进行加或减的操作
 *
 * 究竟该使用哪种循环
 * 如果有固定的次数 用for
 * 如果必须执行一次 用do_while
 * 其他情况用while
 */
package Study;

import java.util.Scanner;

public class Class4_1_1 {
    public static void main(String[] args) {
        //n的阶乘
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int factor = 1;
//        while (i<=n)
//        {
//            factor = factor * i;
//            i = i + 1;
//        }
        for (i=1;i<=n;i=i+1) //此处不能加";'
        {
            factor = factor * i;
        }
        System.out.println(factor);
    }
}
