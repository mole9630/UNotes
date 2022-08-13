/**
 * 函数内的变量-本地变量
 *  函数的每次运行,就产生了一个独立的变量空间,在这个空间中的变量,是函数的这次运行所独有的,称作本地变量
 *  定义在函数内部的变量就是本地变量
 *  参数也是本地变量
 * 变量的生存期和作用域
 *  生存期:什么时候这个变量开始出现了,到什么时候它消亡了
 *  作用域:在(代码的)什么范围内可以访问这个变量(这个变量可以起作用)
 *  对于本地变量,这两个问题的答案是统一的:大括号内--块
 * 本地变量的规则
 *  本地变量是定义在块内的
 *      它可以是定义在函数的块内
 *      也可以定义在语句的块内
 *      甚至可以随便拉一对大括号来定义变量
 *  程序运行进入这个块之前,其中的变量不存在,离开这个快,其中的变量就消失了
 *  块外面定义的变量在里面仍然有效
 *  不能再一个块内定义同名的变量,也不能定义块外面定义过的变量
 *  本地变量不会被默认初始化
 */
package Study;

public class Class7_2_2 {
    public static void sum(int a, int b)
    {
        int i;
        int sum1 = 0;
        for(i=a;i<=b;i++)
        {
            sum1 += i;
        }
        System.out.println(a + "到" + b + "的和为:"+sum1);
    }

    public static int factor(int i)
    {
        if (i == 1)
            return i;
        return i*factor(i-1);
    }


    public static void main(String[] args) {
        sum(1,10);
        sum(10,20);
        sum(20,30);
        int k =factor(3);
        System.out.println("3的阶乘为:"+k);
    }
}
