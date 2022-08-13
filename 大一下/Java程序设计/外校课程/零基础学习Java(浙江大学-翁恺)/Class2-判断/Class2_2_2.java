/**
 * 判断语句
 */
package Study;

import java.util.Scanner;

public class Class2_2_2 {
    public static void main(String[] args) {
        final int MINOR = 35;
        System.out.println("请输入你的年龄:");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("你的年龄是:" + age);
        if (age < MINOR) {
            System.out.println("年轻是美好的");
        }
        System.out.println("年龄决定了你的精神世界");

        //比较两数大小
        System.out.println("\n**** 比较两数大小 ****");
        System.out.println("请输入第一个数:");
        int x = in.nextInt();
        System.out.println("请输入第二个数:");
        int y = in.nextInt();
        int max;
        if (x > y)
        {
            max = x;
        }
        else
        {
            max = y;
        }
        System.out.println("max=" + max);


        //工资计算器
        System.out.println("\n**** 工资计算器 ****");
        /**
         * 每周工时大于40(STANDARD)是一种计算方式
         * 每周工时小于40(STANDARD)是另一种计算方式
         */
        final double RATE = 8.25;
        final int STANDARD = 40;
        double pay = 8.8;
        System.out.println("Enter the number of hours worked:");
        int hours = in.nextInt();
        System.out.println();
        if (hours > STANDARD)
        {
            pay = STANDARD * RATE + (hours-STANDARD) * (RATE*1.5);
        }
        else
        {
            pay = hours * RATE;
        }
        System.out.println("Gross earnings:" + pay);

    }
}
