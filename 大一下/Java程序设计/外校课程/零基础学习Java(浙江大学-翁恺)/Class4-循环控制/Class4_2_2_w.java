//前50个素数(课后作业)
package Study;

import java.util.Scanner;

public class Class4_2_2_w {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        for (int n=2;count<=50;n++)
        {
            int isPrime = 1;
            count++;
            for (int i=2;i<n;i++)
            {
                if (n%i == 0)
                {
                    isPrime = 0;
                    count--;
                    break;
                }
            }
            if (isPrime == 1)
            {
                System.out.print(n + " ");
            }
        }
    }
}
