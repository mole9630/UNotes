/**
 * 浮点数
 * 美国人固执地使用英制计量单位,他们习惯用几尺几寸(英尺英寸)来报自己的身高.如果遇到一个美国人告诉你他是5英尺7,他的身高应该是一米几呢?
 * eg:(5 + 7 ÷ 12) × 0.3048 = 1.7018米
 */
package Study;

import java.util.Scanner;

public class class1_3_1 {
    public static void main(String[] args) {
        int foot; //英尺
        int inch; //英寸 double inch;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入英尺:");
        foot = in.nextInt();
        System.out.println("请输入英寸:");
        inch = in.nextInt(); //inch = in.nextDouble()更精确
        System.out.println("Debug:foot=" + foot + " inch=" + inch);
        System.out.println("Debug:" + 10 / 3); //结果为:3 两个整型在作除法时,结果只能是整型

        /**
        * 因为两个整数的运算的结果只能是整数
        * 10÷3×3=>?
        * 10和10.0在Java中是完全不同的数
        * 10.0是浮点数
        * 浮点数即带小数点的数值,浮点计算试试有误差的
        */
        System.out.println((foot + inch / 12.0) * 0.3048); //两个整型在作除法时,结果只能是整型
        System.out.println((foot + inch / 12) * 0.3048); //若此时inch是double类型,在除法的两边,只要有一个数是浮点数,他就是一个浮点的运算方式
        System.out.println("1.2-1.1=" + (1.2-1.1)); //0.99999… 浮点计算试试有误差
    }
}
