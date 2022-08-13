/**
 * 比较
 */
package Study;

import java.util.Scanner;

public class Class2_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //读入投币金额
        System.out.println("请投币:");
        int amount = in.nextInt(); //打印车票
        if (amount >= 10) {
            System.out.println("***************");
            System.out.println("*城际轨道交通专线*");
            System.out.println("*  无指定座位  *");
            System.out.println("**************");
            System.out.println("找零:" + (amount - 10)); //计算并打印找零
        }
    }
}
