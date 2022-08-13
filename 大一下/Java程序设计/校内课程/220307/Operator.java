/**
 * 强制类型转换,算数运算符,关系表达式,逻辑运算符,复合赋值运算符,位运算
 */

package mole;

public class Operator {
    public static void main(String[] args) {
       //强制类型转换
       System.out.println("**** 强制类型转换 ****");
        float f1,f2;
        double d1 = 123.456789123, d2 = 12.345678;
        System.out.println("d1=" + d1 + " d2=" + d2);
        f1 = (float) d1; //在前加( ) 即强制类型转换
        System.out.println("f1=" + f1); //结果:123.45679



        //算数运算符
        System.out.println("\n**** 算术运算符 ****");
        System.out.println("7/2=" + 7 / 2); //3 -整除 取商
        System.out.println("7.0/2=" + 7.0 / 2); //3.5 -除法 浮点型
        //System.out.println("7/0=" + 7 / 0); //抛出异常 by zero
        System.out.println("7.0/0=" + 7.0 / 0); //Infinity 无穷大
        System.out.println("7%2=" + 7 % 2); //1 整除 取余数
        System.out.println("7.0%2=" + 7.0 % 2); //1.0
        System.out.println("7.0%0=" + 7.0 % 0); //NaN -not a number
        System.out.println("7.123%2=" + 7.123 % 2); //1.1230000000000002
        System.out.println("7.123/2=" + 7.123 / 2); //3.5615
        //自增
        int a = 3;
        System.out.println((a++) + (a++) + (a++)); //12


        //关系表达式
        //运算结果一般为布尔值 即true/false
        System.out.println("\n**** 关系表达式 ****");
        System.out.println(2 == '2'); //false '2'使用的是Ascii码
        System.out.println(true == true); //true
//        System.out.println(NaN == NaN); //抛出异常


        //逻辑运算符
        //运算结果一般为布尔值 即true/false
        System.out.println("\n**** 逻辑运算符 ****");
        //逻辑与(短路效应) -如果第一个操作数为false 则第二个操作数不参与运算
        System.out.println("*** 逻辑与(短路效应) ***");
        int b = 3,c = 3;
        System.out.println(1<2 && (b++)<3); //false
        System.out.println("b=" + b); //b=4
        System.out.println(1>2 && (c++)<3); //false 因为1>2为false,第二个(c++)<3就不参与运算
        System.out.println("c=" + c);//c=3
        //逻辑或(短路效应) -如果第一个操作数为true 则第二个操作数不参与运算
        System.out.println("*** 逻辑或(短路效应) ***");
        int d = 3,e = 3;
        System.out.println(1<2 || (d++)<3); //true 因为1>2为true,第二个(d++)<3就不参与运算
        System.out.println("d=" + d); //d=3
        System.out.println(1>2 || (e++)<3); //false
        System.out.println("e=" + e);//e=4
        //异或 优先级:比较运算符高于逻辑运算符
        System.out.println("*** 异或 ***");
        System.out.println(1>2 ^ 3<4); //true


        //复合赋值运算符
        System.out.println("**** 复合赋值运算符 ****");
        int f=3, g=5;
        g *= f; //等价于g = g * f = 5 * 3 = 15
        System.out.println("g=" + g); //g=15
        g *= f + 5; //等价于 g = g * （f + 5) = 15 * (3 + 5) = 120
        System.out.println("g=" + g); //g=120


        //条件运算符(三目运算符)
        System.out.println("\n**** 条件运算符 ****");
        int h=3;
        h= 3>5 ? 3 : 5;
        System.out.println("h=" + h); //h=5 !!!
        h= 3>5 ? 3 : (4<5 ? 4 : 5); //先算括号内,再运算整体(即括号优先级最高)
        System.out.println("h=" + h); //h=4
        h= 3>5 ? 3 : 4<5 ? 4 : 5; //三目运算符嵌套三目运算符 结合性:从右往左
        System.out.println("h=" + h); //h=4


        //位运算
        /**
         * 二进制:128 64 32 16 8 4 2 1
         * 原码反码补码:
         * 计算机真正参与运算的是补码.正数的三码相同。负数↓
         * · 原码:-7取绝对值算出原码 7,转换成二进制1000 0001,修改符号位(正0负1)
         * · 反码:符号位不变,按位取反,即1111 1000
         * · 补码:反码+1=补码 即1111 1001*/
        System.out.println("\n**** 位运算 ****");
        byte bt=6;
        System.out.println("bt=" + bt); //转换成二进制:0000 0110 -->6
        System.out.println("~bt=" + ~bt); //转换成二进制:1111 1001 -->-7
        short s1=15; //转换成二进制:0000 0000 0000 1111
        short s2=9; //转换成二进制:0000 0000 0000 1001
        /**
        * s1 & s2 = 9 二进制:0000 0000 0000 1001 -全1为1
        * s1 | s2 = 15 二进制:0000 0000 0000 1111 -全0为0
        * s1 ^ s2 = 6 二进制:0000 0000 0000 0110 -相同为0 相异为1
        */
        System.out.println(s1&s2); //9
        System.out.println(s1|s2); //15
        System.out.println(s1^s2); //6

        //移位运算
        System.out.println("*** 移位运算 ***");
        System.out.println(6<<2); //24 左移 高位被舍弃 左移一次即乘2 (0000 0110 <<2 0001 1000 =24)
        System.out.println(9>>2); //带符号右移 低位被舍弃,符号位不变 ([0]000 1001 >>2 [0]000 0010 =2)
        System.out.println(-9>>2); //带符号右移 低位被舍弃,符号位不变 ([1]111 0111 >>2 [1]111 1101 =-3)
        System.out.println(-9>>>2); //无符号右移 与带符号右移基本相同,其区别是符号位右移,最高位补0 ([1]111 0111 >>>2 [0]011 1101 =0x3d) 自动转换成int类型
        System.out.println(9>>>2); //无符号右移 与带符号右移基本相同,其区别是符号位右移,最高位补0 ([0]000 1001 >>>2 [0]000 0010 =2)
        }
    }