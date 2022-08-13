/**
 * 字符类型
 */
package Study;

public class Class6_1_1 {
    public static void main(String[] args) {
        char c = 'A'; //可以是一个字母,一个数字,甚至是一个汉字(只能是一个)
        System.out.println("c=" + c); //A

        //字符的计算
        System.out.println("\n**** 字符的计算 ****");
        c++;
        System.out.println("c=" + c); //B
        c = '汉';
        c++;
        System.out.println("c=" + c); //汊 unicode排在汉后面的那个字
        //字符的计算(字母相减)
        char a = 'A';
        char b = 'D';
        System.out.println(a-b); //-3 即A与D之间的距离
        System.out.println((int)a); //65 A在unicode中的编码
        char d = '\u0041'; //即unicode中十六进制的'A' 直接写65也可以输出A(无需引号)
        System.out.println(d);

        //大小写字母转化
        System.out.println("\n**** 大小写字母转换 ****");
        char e = 'A';
        char f = (char) (e + 'a' - 'A'); //大写转小写:加上小写字母减去大写字母的距离
        System.out.println(f);
        char g = (char) (f + 'A' - 'a'); //小写转大写:加上大写字母减去小写字母的距离
        System.out.println(g);

        //字母的比较
        System.out.println("\n**** 字母的比较 ****");
        System.out.println('A' > 'B'); //false 因为A在前面,故其编码值就会比较小
        System.out.println('a' > 'A'); //true 因为小写的a排在大写的A后面
        System.out.println('汉' > 'A'); //true 因为汉字比所有的西文字母都要大
    }
}
