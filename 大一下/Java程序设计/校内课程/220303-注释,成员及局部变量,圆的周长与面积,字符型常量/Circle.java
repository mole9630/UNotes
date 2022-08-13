package charpter2;

public class Circle {

    public static void main(String[] args) {
        final float PI = 3.1415f;//定义常量时,常量名应全部大写
        //圆的面积
        float r = 3.1f,s;//浮点型在数值最后需加"f",大小写不敏感 | 定义变量的同时,应给它初始值即变量的初始化
        s = PI * r * r;

        //圆的周长
        int a = 2,b = 3;
        long d = (a + b) * 2;//自动将数据类型int转换为long

        /*
        long a = 2,b = 3;
        int d = (a + b) * 2;//类型转换不符合
         */

        //字符型常量
        char ch_s = '\u0061';//6*16+1=97
        char ch_b = 'A';// \u0061 字符型变量赋值,可以使用十六进制数据或直接字符
        char ch_0 = '\u0030';//0

        System.out.println(s);
        System.out.println(d);
        System.out.println(ch_s);
        System.out.println(ch_b);
        System.out.println(ch_0);
        System.out.println(ch_s + ch_b);
        System.out.println(ch_s + " " + ch_b);
    }
}
