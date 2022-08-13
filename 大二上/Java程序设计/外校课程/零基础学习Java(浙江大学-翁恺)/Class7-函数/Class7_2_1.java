/**
 * 参数传递
 *  如果函数有参数,调用函数时必须传递给它数量和类型正确的值
 *  可以传递给函数的值是表达式的结果,包括:
 *      字面量
 *      变量
 *      函数的返回值
 *      计算的结果
 * 传值
 *  每个函数有自己的变量空间,参数也位于这个独立的空间中,和其他函数没有关系
 *  过去,对于函数参数表中的参数,叫做"形式参数“,调用函数时给的值,叫做"实际参数"
 *  由于容易让初学者误会实际参数计算实际在函数中进行计算的参数,误会调用函数的时候把变量而不是值传进去了,所以我们不建议继续用这种古老的方式来称呼它们
 *  我们认为,它们是参数和值的关系
 */
package Study;

public class Class7_2_1 {
    public static int max(int a,int b) //(int a,int b)为参数
    {
        int ret;
        if(a>b)
        {
            ret = a;
        }
        else
        {
            ret = b;
        }
        return ret;
    }
    public static void swap(int a,int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        max((int)10.0,20); //类型不匹配要做强制类型转换
        max(10,'a'); //宽的可接受窄的(char->int->double)
        int a = 5;
        int b = 6;
        System.out.println("a="+a+",b="+b);
        swap(a,b); //(a,b)为值
        System.out.println("a="+a+",b="+b); //没有返回值,所以不能输出,swap内的值与main内的值并无关联
    }
}
