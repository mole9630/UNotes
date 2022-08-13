/**
 * 类型的转换
 */
package Study;

import java.util.Scanner;

public class Class1_3_3 {
    public static void main(String[] args) {
        int foot;
        double inch;
        foot = (int)(30 / 3.0); //强制转换 (int)会把右边的内容变成int型
        Scanner in = new Scanner(System.in);
        System.out.println("请输入英尺:");
        foot = in.nextInt();
        System.out.println("请输入英寸:");
        inch = in.nextDouble();
        System.out.println((foot + inch / 12) * 0.3048 * 100);
        System.out.println((int)((foot + inch / 12) * 0.3048 * 100) + "cm"); //强制转换 (int)会把右边的内容变成int型
    }
}
