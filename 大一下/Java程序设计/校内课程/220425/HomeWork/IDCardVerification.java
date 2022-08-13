/**
 * 从键盘上输入身份证号，使用正则表达式验证身份证号格式是否合法。
 */
package Work;

import java.util.Scanner;

public class IDCardVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String idNumber = sc.next();
        String regex = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";
        if (idNumber.matches(regex)) {
            System.out.println("身份证号合法");
        }
        else {
            System.out.println("身份证号不合法");
        }
    }
}
