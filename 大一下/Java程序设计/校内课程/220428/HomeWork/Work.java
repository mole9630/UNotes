/**
 * 编写程序:从键盘输入一个字符串，输出其长度，并判断是否包含“java”四个字母，如果包含，输出它在字符串中的位置。
 */

/
package Work;

import java.util.Scanner;

public class Work {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str = in.next(); //读入输入的字符串
            System.out.println("该字符串长度为:" + str.length());
            if (str.contains("java")) //判断字符串中是否包含java
            {
                System.out.println("java字符串位于第" + str.indexOf("java") + "位");
            }
            else
            {
                System.out.println("该字符串不包含java");
            }
        }
}
