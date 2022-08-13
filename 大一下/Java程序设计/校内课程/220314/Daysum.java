package mole;

import java.util.Scanner;

public class Daysum {
    public static void main(String[] args) {
        int day,month,year,sum=0,leap;
        System.out.print("请分别输入年,月,日\n");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        month = in.nextInt();
        day = in.nextInt();

        switch (month)
        {
            case 12:
                sum += 31;
            case 11:
                sum += 30;
            case 10:
                sum += 31;
            case 9:
                sum += 30;
            case 8:
                sum += 31;
            case 7:
                sum += 31;
            case 6:
                sum += 30;
            case 5:
                sum += 31;
            case 4:
                sum += 30;
            case 3:
                sum += 31;
            case 2:
                sum += 28;
            case 1:
                sum += day;
                break;
            default:
                System.out.println("日期值非法");
                break;
        }
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            leap = 1;
        else
            leap = 0;
        if (leap == 1 && month > 2)
            sum++;
        System.out.println("这是" + year + "年的第" + sum + "天");
    }
}
