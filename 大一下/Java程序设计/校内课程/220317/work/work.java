package Study;

import java.util.Scanner;

public class work {
    public static void printPyramid(int n)
    {
        int a,b;
        for (a=1;a<=n;a++)
        {
            for (b=1;b<=n-a;b++)
            {
                System.out.print("  ");
            }
            for (b=1;b<=a;b++)
            {
                System.out.print(b + " ");
            }
            for (b=a-1;b>0;b--)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

    public static void printPyramid(char n)
    {
        char ch = 'a';
        int i,j;
        n = (char) (n - 'a');
        for (j=0;j<=n;j++)
        {
            for (i=1;i<=n-j;i++)
            {
                System.out.print("  ");
            }
            for (i=0;i<j;i++)
            {
                System.out.printf("%c ",ch+i);
            }
            for (i=j;i>=0;i--)
            {
                System.out.printf("%c ",ch+i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type;
        System.out.println("如果打印数字输入:0,如果打印字母输入:1");
        type = in.nextInt();
        if (type == 0)
        {
            System.out.print("请输入打印__行:");
            int n = in.nextInt();
            printPyramid(n);
        }
        else
        {
            System.out.print("请输入打印到__字母为止:");
            char n = in.next().toCharArray()[0];
            printPyramid(n);
        }
    }
}
