/**
 * 逃逸字符
 * 用来表示无法印出来的控制字符或特殊字符,它由一个反斜杠"\"开头,后面跟上另一个字符,这两个字符合起来,组成了一个字符
 * \b:回退一格          \":双引号
 * \t:到下一个表格位     \':单引号
 * \n:换行             \\:反斜杠本身
 * \r:灰尘
 */
package Study;

public class Class6_1_2 {
    public static void main(String[] args) {
        System.out.println("abc\bd"); //abd c就被删去了
        System.out.println("abc\td"); //abc d
        System.out.println("abc\nd");
    }
}
