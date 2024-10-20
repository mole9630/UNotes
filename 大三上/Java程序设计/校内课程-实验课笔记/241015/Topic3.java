import java.util.Scanner;

public class Topic3 {
    public static void main(String[] args) {
        // 题目3-3：从键盘输入3个整数，编写程序求三个整数中的最大值。
        int x, y, z;
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入三个数字：");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        max = x;

        if (max < y) {
            max = y;
        }
        if (max < z) {
            max = z;
        }

        System.out.println("最大值：" + max);
    }
}
