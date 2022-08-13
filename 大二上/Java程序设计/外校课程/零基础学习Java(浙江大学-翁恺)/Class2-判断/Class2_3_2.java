/**
 * 多路分支
 * 控制表达式只能是整数型的结果
 * 常量可以是常数,也可以是常数计算的表达式
 * 根据表达式的结果,寻找匹配的case,并执行case后面的语句,直到break为止
 * 如果所有的case都不匹配,那么就执行default后面的语句;如果没有default,则什么都不做
 */
package Study;

import java.util.Scanner;

public class Class2_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        switch (type)
        {
            case 1: //如果为1 接着执行2
            case 2:
                System.out.println("早上好");
                break;
            case 3:
                System.out.println("晚上好");
            case 4:
                System.out.println("再见");
                break;
            default:
                System.out.println("?");
        }
    }
}
