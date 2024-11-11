package Topic1;

import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        try {
            System.out.println(1 / a);
        } catch (ArithmeticException e) {
            System.out.println("错误信息为：" + e.getMessage());
        }
    }

}
