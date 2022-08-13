/**
 * Class5_1_1 初识数组
 * 输出数组的平均数并输出大于平均数的数字
 *
 * Class5_1_2 创建数组
 * 数组是一种容器(放东西的东西),特点是:
 *      其中所有的元素具有相同的数据类型
 *      一旦创建,则不能改变大小
 * 数组是一种数据结构,能记录同一种类型的多个数据
 *      数组中的每个数据叫做元素
 *      所有的元素具有相同的数据类型
 * 定义数组变量
 * <类型>[] <名字> = new <类型>[元素个数];
 *      元素个数必须是整数
 *      元素个数必须给出
 *      元素个数可以是变量
 */
package Study;

import java.util.Scanner;

public class Class5_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[100]; //定义数组
        int x,cnt = 0;
        double sum = 0;
        x = in.nextInt();
        while (x != -1)
        {
            numbers[cnt] = x; //numbers[0]=x… 对数组中的元素赋值
            sum += x;
            cnt ++;
            x = in.nextInt();
        }
        if (cnt > 0)
        {
            double average = sum/cnt;
            for (int i=0;i<cnt;i++)
            {
                if (numbers[i] > average) //使用数组中的元素
                {
                    System.out.println(numbers[i]); //使用数组中的元素
                }
            }
            System.out.println(sum / cnt);
        }
    }
}
