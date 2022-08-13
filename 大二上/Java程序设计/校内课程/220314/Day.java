package mole;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        System.out.println("请输入年月");
        int year,month,days=0;
        Scanner in = new Scanner(System.in);
        year=in.nextInt();
        month=in.nextInt();
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            {
                days = 31;
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11:
            {
                days = 30;
                break;
            }
            case 2:
            {
                if(year%4==0 && year%100!=0 || year%400==0)
                {
                    days = 29;
                    break;
                }
                else
                {
                    days = 28;
                    break;
                }
            }
        }
        System.out.println("days=" + days);
    }
}
