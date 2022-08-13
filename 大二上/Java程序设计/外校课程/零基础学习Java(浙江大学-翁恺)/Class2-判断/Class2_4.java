/**
 * 判断语句常见错误
 */
package Study;

public class Class2_4 {
    public static void main(String[] args) {
        //忘记大括号
        double age=0,salary=0;
        if (age>60) //错误点
        salary = salary*1.2;
        System.out.println(salary);
        //纠正
        /**
         * 永远在if和else后面加上大括号,即使当时后面只有一条短语
         */
        if(age>60)
        {
            salary = salary*1.2;
            System.out.println(salary);
        }

        //if后面加分号
        if (age>60); //错误点
        {
            salary = salary*1.2; //与if无关系,正常运行
            System.out.println(salary); //与if无关系,正常运行
        }
        //纠正
        if (age>60)
        {
            salary = salary*1.2;
            System.out.println(salary);
        }

        //错误使用=和==
        int a=0,b=0;
        if(a = b) //应使用==
        {
            System.out.println("A=B");
        }
        //纠正
        if(a == b)
        {
            System.out.println("A=B");
        }

        //代码风格
        /**
         * 在if和else之后必须加上大括号形成语句块
         * 大括号内的语句缩进一个tab的位置
         */
    }
}
