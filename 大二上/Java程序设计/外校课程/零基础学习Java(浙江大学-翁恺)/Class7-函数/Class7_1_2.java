/**
 * 调用函数
 *  函数(参考值)
 *  ()起到了表示函数调用的重要作用
 *  即使没有参数也需要()
 *  如果有参数，则需要给出正确的参数和顺序
 *  这些值会被按照顺序依次用来初始化函数中的参数
 * return
 *  return停止函数的执行,并返回一个值
 *
 */
package Study;

public class Class7_1_2 {
    public static void f()
    {
        System.out.println("成功调用f函数");
    }

    public static int max(int a,int b)
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

    public static void main(String[] args) {
        f();
        int a = 5;
        int b = 6;
        int c;
        c = max(10,12);
        c = max(a,b);
        c = max(a,23);
        c = max(c,23);
        c = max(max(c,a),max(5,b));
        System.out.println(max(a,b));
    }
}
