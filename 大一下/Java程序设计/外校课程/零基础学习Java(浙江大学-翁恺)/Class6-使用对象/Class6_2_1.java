/**
 * 包裹类型
 * 每种基础类型都有对应的包裹类型
 * boolean -> Boolean
 * char -> Character
 * int -> Integer
 * double -> Double
 */
package Study;

public class Class6_2_1 {
    public static void main(String[] args) {
        int i = 10;
        Integer k = 10; //包裹类型和基础类型一样,可以直接定义赋值
        k = i; //包裹类型和对应的基础类型也可以直接赋值
        System.out.println(Integer.MAX_VALUE); //得到该类型的最大值(MIN_VALUE即最小值)
        System.out.println(Character.isDigit('a')); //false 判断是不是一个数字
        System.out.println(Character.isLowerCase('a')); //true 判断是不是一个小写字母
        System.out.println(Character.toLowerCase('A')); //a 大写字母转小写字母
    }
}
