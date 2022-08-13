/**
 * Class5_1_3 数组的元素
 * 每个元素都是那种类型的变量
 * 索引或下标都是从0开始的
 * 有效的下标
 *      最小的下标是0,最大的下标是数组的元素个数-1
 *      可是编译器不用检查看你是否用了有效的下标
 *      但是如果运行的适航出现了无效的下标,可能会导致程序终止
 * 每个数组有一个内部成员length,会告诉它的元素的数量
 */
package Study;

import java.util.Scanner;

public class Class5_1_3 {
    public static void main(String[] args) {
        //可以自定义数组的长度
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        cnt = in.nextInt();
        double sum = 0;
        if (cnt > 0)
        {
            int[] numbers = new int[cnt]; //定义数组
            for (int i=0;i<cnt;i++)
            {
                numbers[i] = in.nextInt(); //numbers[0]=x… 对数组中的元素赋值
                sum += numbers[i];
            }
                double average = sum/cnt;
                for (int i=0;i<cnt;i++) //for (int i=0;i<numbers.length;i++)
                {
                    if (numbers[i] > average) //使用数组中的元素
                    {
                        System.out.println(numbers[i]); //使用数组中的元素
                    }
                }
                System.out.println(sum / cnt);
        }
            else
            {
                System.out.println("输入不合法!");
            }
        }
}