/**
 * 编程实现:利用String类的常用方法检测字符串是否为回文串。
 */
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Str = in.next(); //输入一串字符
        int left=0, right=Str.length()-1;
        boolean flag = true; //缺省字符串是回文
        while (left < right) //判断是否是回文
        {
            if (Str.charAt(left) == Str.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                flag = false; //返回不是回文
                break;
            }
        }
        if (flag)
        {
            System.out.println("\"" + Str + "\"" + "是回文串");
        }
        else
        {
            System.out.println("\"" + Str + "\"" + "不是回文串");
        }
    }
}