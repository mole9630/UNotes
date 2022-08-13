/**
 * 赋值
 */
package Study;

import java.util.Scanner;

public class class1_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int price,amount = 0; //只给了amount初始化,price并没有初始化
        int price = 0; //变量
        final int amount = 100; //+final即表示 常量
//        amount = 50;//由于是常量 故amount已经不能再被赋值了

        /*
        * price = in.nextInt();
        * amount = in.nextInt();
        * 此时输入"50 23"系统会自动认定为两个值
        */

        System.out.println("请输入一个数:");
        price = in.nextInt(); //表达式
        System.out.println(amount + "-" + price + "=" + (amount - price));
    }
}
