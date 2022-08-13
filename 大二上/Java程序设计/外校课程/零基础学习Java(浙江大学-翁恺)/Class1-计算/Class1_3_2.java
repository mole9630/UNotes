/**
 * 运算符优先级
 * 优先级值越低,优先级越高,越先执行
 * 优先级      运算符     运算      结合关系        举例
 *   1         +     单目取正     自左向右        a*+b
 *   1         -     单目取负     自右向左        a*-b
 *   2         *      乘法       自左向右         a*b
 *   2         /      除法       自左向右         a/b
 *   2         %      取余       自左向右         a%b
 *   3         +      加法       自左向右         a+b
 *   3         -      减法       自左向          a-b
 *   3         +    字符串连接    自左向右    "hello"+"world"
 *   4         =      赋值       自右向左         a=b
 */
package Study;

public class Class1_3_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = -20;
        System.out.println("a*-b=" + a * -b); //单目运算符:只有一个操作数 -b的"-"就是一个单目运算符,优先级最高

        //结合关系
        /**
         * 一般自左向右
         * 单目+—和赋值=自右向左
         */
        int result,c=1;
        result = a = b = 3+c; //自右向左 即result =(③) a =(②) b =(①) 3+c
        result = 2;
        result = (result = result*2) * 6 *(result = 3+result);
    }
}
