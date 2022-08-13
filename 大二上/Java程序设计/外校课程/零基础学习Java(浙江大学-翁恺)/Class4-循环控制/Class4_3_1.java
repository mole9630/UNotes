/**
 * 求和
 */
package Study;

import java.util.Scanner;

public class Class4_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        int sign = 1;
        for (int i=1;i<=n;i++) //用逗号在每个表达式内放多个表达式 for (int i=1;i<=n;i++,sign=-sign)
        {
//            sum += 1.0/i; //求和(f(n)=1 + 1/2 + 1/3 + 1/4 + … + 1/n)
            sum += sign*1.0/i; //求和(f(n)=1 + 1/2 - 1/3 + 1/4 - … + 1/n)
            sign = -sign;
        }
        System.out.println(sum);
        System.out.printf("%.2f",sum);
    }
}
