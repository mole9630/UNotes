/**
 * 变量
 */
package Study;

import java.util.Scanner;

public class class1_2_2 {
    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        Scanner in = new Scanner(System.in);
        int price;
        price = in.nextInt();
//        System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt())); //有两个nextInt 故要输入2次
        System.out.println("100-"+ price + "=" +(100 - price ));
    }
}
