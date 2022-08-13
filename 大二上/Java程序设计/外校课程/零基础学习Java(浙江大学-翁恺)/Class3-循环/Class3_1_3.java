/**
 * while循环与验证
 *
 * 如果我们把while翻译作"当",那么一个while循环的意思就是:当条件满足时,不断地重复循环体内的语句.
 * 循环执行之前判断是否继续循环,所以有可能循环一次也没有执行.
 * 条件成立是循环继续的条件.
 */
package Study;

public class Class3_1_3 {
    public static void main(String[] args) {
        int x=1;
        int n=1;
        while (x>10)
        { //循环体 -循环体内要有改变条件的机会
            x = x/10;
            n = n+1;
            System.out.println("n="+ n + " x=" + x); //在程序适当的地方插入输出来显示变量的内容
        }

        //验证
        /**
         * 测试程序常使用边界数据,如有效范围两端的数据,特殊的倍数等
         * 个位数
         * 10
         * 0
         * 负数
         */
    }
}
