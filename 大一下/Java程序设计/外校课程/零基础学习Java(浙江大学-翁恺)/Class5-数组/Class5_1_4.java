/**
 * 数组变量
 * 数组变量是数组的管理者而非数组本身
 * 数组必须创建出来然后交给数组变量来管理
 * 数组变量之间的赋值是管理权限的赋予
 * 数组变量之间的比较是判断是否管理同一个数组
 */
package Study;

import java.util.Scanner;

public class Class5_1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = {87,98,69,54,65,76,87,99}; //直接初始化数组
        System.out.println(scores.length); //输出数组的长度
        for (int i=0;i<scores.length;i++) //数组的遍历
        {
            System.out.print(scores[i] + " ");
        }


        //数组变量赋值
        System.out.println("\n**** 数组变量赋值 ****");
        int[] a = new int[10];
        a[0] = 5;
        int[] b = a; //相当于a与b都是管理的同个数组
        System.out.println("a[0]=" + a[0]);
        b[0] = 16;
        System.out.println("a[0]=" + a[0]); //16

        //例2
        System.out.println("*** 例2 ***");
        int[] a1 = {1,2,3,4,5};
        int[] a2 = a1;
        for (int i=0;i<a2.length;++i)
        {
            a2[i]++;
        }
        for (int i=0;i<a1.length;++i)
        {
            System.out.print(a1[i] + " ");
        }


        //数组变量比较
        System.out.println("\n**** 数组变量比较 ****");
        int[] c = {1,2,3,4,5};
        int[] d = c;
        int[] e = {1,2,3,4,5};
        System.out.println(c==d); //true 表示a与b数组的管理者相同
        System.out.println(c==e); //false 虽然c与e数组内容相同,但管理者不同,故为false


        //数组变量的拷贝
        System.out.println("\n**** 数组变量的拷贝 ****");
        int[] f = {1,2,3,4,5};
        int[] g = new int[f.length];
        for (int i=0;i<g.length;i++)
        {
            g[i] = f[i];
        }
        for (int i=0;i<g.length;i++)
        {
            System.out.print(g[i] + " ");
        }
        System.out.println(f==g); //false


        //数组元素的比较
        System.out.println("\n**** 数组元素的比较 ****");
        int[] h = {1,2,3,4,5};
        int[] j = new int[h.length];
        for (int i=0;i<j.length;i++)
        {
            j[i] = h[i];
        }
        boolean isEqu = true;
        for (int i=0;i<j.length;i++)
        {
            if (h[i] != j[i])
            {
                isEqu = false;
                break;
            }
        }
        System.out.println(isEqu); //true
    }
}
