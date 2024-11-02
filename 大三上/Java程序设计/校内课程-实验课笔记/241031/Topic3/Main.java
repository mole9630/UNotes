package Topic3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一行字符:");
        String input = scanner.nextLine();

        int letters=0, spaces=0, digits=0, others=0;

        for (int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) { // 判断是否为字母
                letters++;
            } else if (Character.isSpaceChar(ch)) { // 判断是否为空格
                spaces++;
            } else if (Character.isDigit(ch)) { // 判断是否为数字
                digits++;
            } else { // 其他
                others++;
            }
        }

        System.out.println("字母数量: " + letters);
        System.out.println("空格数量: " + spaces);
        System.out.println("数字数量: " + digits);
        System.out.println("其他字符数量: " + others);
    }
}