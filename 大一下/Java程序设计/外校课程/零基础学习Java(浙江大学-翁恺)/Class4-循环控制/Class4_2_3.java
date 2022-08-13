/**
 * 逻辑类型
 */
package Study;

import java.util.Scanner;

public class Class4_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isPrime = true; //Boolean只能有2个值:true/false
        for (int i=2;i<n;i++)
        {
            if (n%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
        {
            System.out.println(n + "是素数");
        }
        else
        {
            System.out.println(n + "不是素数");
        }
    }
}
