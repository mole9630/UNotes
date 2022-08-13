/**
 * 嵌套和级联的判断
 */
package Study;

import java.util.Scanner;

public class Class2_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //比较三数大小(嵌套)
        System.out.println("\n**** 比较三数大小 ****");
        System.out.println("请输入第一个数:");
        int x = in.nextInt();
        System.out.println("请输入第二个数:");
        int y = in.nextInt();
        System.out.println("请输入第三个数:");
        int z = in.nextInt();
        int max;
        if (x > y) //else总是和最近的if匹配
        { //虽然只有一条语句,但最好还是加上大括号
            if (x > z);
            {
                max = x;
            }
        }
        else
        {
            if (y > z)
            {
                max = y;
            }
            else
            {
                max = z;
            }
        }
        System.out.println("max=" + max);

        //分段函数
        System.out.println("\n**** 分段函数 ****");
        /**
         * 用代码表示:(级联的if语句)
         * f(x) = -1; x<0
         *         0; x=0
         *        2x; x>0
         */
        int f;
        int x1 = 1;
        if(x < 0)
        {
            f = -1;
        }
        else if (x1 == 0)
        {
            f = 0;
        }
        else
        {
            f = 2 * x1;
        }
        System.out.println("f=" + f);
    }
}
