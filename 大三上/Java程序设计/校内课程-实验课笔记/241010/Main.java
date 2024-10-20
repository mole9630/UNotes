import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 题目2-1：编写一个Java程序，计算一个半径为3.0cm的圆的周长和面积，并且输出计算结果。
		int r;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("输入半径:");
		r = sc.nextInt();
		
		System.out.println("周长为：" + 2*r*Math.PI);
		System.out.println("面积为：" + Math.PI * Math.pow(r, 2));
		
		
		// 题目2-2： 编写一个Java程序，根据勾股定理计算一个给定两直角边的直角三角形的斜边长。
        System.out.print("输入直角三角形的第一条直角边长:");
        double sideA = sc.nextDouble();
        
        System.out.print("输入直角三角形的第二条直角边长:");
        double sideB = sc.nextDouble();

        // 计算斜边长
        // double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        // 输出结果
        System.out.println("直角三角形的斜边长为：" + hypotenuse);
		
		
		// 题目2-3：判断某年是否是闰年。
		int year;
		System.out.print("输入一个年份：");
		year = sc.nextInt();
		if ((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
		

	}

}
