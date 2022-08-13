package mole;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type;
        double g,sum=0;
        System.out.println("请输入纳税人的类型(0-单身纳税人,1-已婚纳税人,2-家庭纳税人):");
        if (in.hasNextInt()) //判断输入的是否为整型
        {
            type = in.nextInt(); //接受输入的整数
            System.out.println("Debug:type=" + type);
            System.out.println("请输入工资数:");
            if (in.hasNextDouble())
            {
                g = in.nextDouble();
                if (type==0)
                {
                    if (g<=6000)
                    {
                        sum = g * 0.1; //百分数最好用实型代替
                    }
                    else if (g>6000 && g<=27950)
                    {
                        sum = 6000*0.1 + (g-6000)*0.15;
                    }
                    else if (g>27950 && g<=67700)
                    {
                        sum = 6000*0.1 + (27950-6000)*0.15 + (g-27950)*0.27;
                    }
                    else if (g>67700 && g<=141250)
                    {
                        sum = 6000*0.1 + (27950-6000)*0.15 + (67700-27950)*0.27 + (g-67700)*0.30;
                    }
                    else
                    {
                        sum = 6000*0.1 + (27950-6000)*0.15 + (67700-27950)*0.27 + (141250-67700)*0.30 + (g-141251)*0.35;
                    }
                }
                else if (type==1)
                {
                    if (g<=12000)
                    {
                        sum = g * 0.1; //百分数最好用实型代替
                    }
                    else if (g>12000 && g<=46700)
                    {
                        sum = 12000*0.1 + (g-12000)*0.15;
                    }
                    else if (g>46700 && g<=112850)
                    {
                        sum = 12000*0.1 + (46700-12000)*0.15 + (g-46700)*0.27;
                    }
                    else if (g>112850 && g<=171950)
                    {
                        sum = 12000*0.1 + (46700-12000)*0.15 + (112850-46700)*0.27 + (g-112850)*0.30;
                    }
                    else
                    {
                        sum = 12000*0.1 + (46700-12000)*0.15 + (112850-46700)*0.27 + (171951-112850)*0.30 + (g-171950)*0.35;
                    }
                }
                else if (type==2)
                {
                    //代码部分
                }
                else
                {
                    System.out.println("类型非法输入");
                }
            }
        }
        System.out.println("税收为:" + sum);
    }
}
