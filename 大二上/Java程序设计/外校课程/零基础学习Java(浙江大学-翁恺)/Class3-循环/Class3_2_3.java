/**
 * 猜数游戏
 * 让计算机想一个数,然后让用户来踩,用户每输入一个数,就告诉它是大了还是小了,直到用户猜对为止,最后还要告诉用户猜了多少次
 *     文字描述:
 *     1 计算机随机生成一个数,记在变量number内;
 *     2 一个负责计次数的变量count初始化为0;
 *     3 让用户输入一个数字x,并且count递增(+1);
 *     4 判断x和number的大小关系,如果x大,就输入"大",如果x小就输出"小";
 *     5 如果x和number不相等(不考虑大小),程序回到第三步;
 *     6 否则 程序输入猜中的次数,然后结束;
 */
package Study;

import java.util.Scanner;

public class Class3_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = (int)Math.random()*100+1; //随机生成一个浮点数 [0,1) --> [0,100] --> [1,100]
        int x;
        int count = 0;
        do
        {
            x = in.nextInt();
            count = count + 1;
            if (x > number)
            {
                System.out.println(x + "偏大");
            }
            else if (x < number)
            {
                System.out.println(x + "偏小");
            }
        }while (x!=number);
        System.out.println("恭喜您猜对了,您共猜了" + count + "次!");
    }
}
