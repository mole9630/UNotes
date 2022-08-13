/**
 * 假设某班30名学生，学号分别为1706041-1706070，全部选修了Java课程。
 * （1）学生信息（包括学生学号，成绩），实现学生类的封装；
 * （2）通过随机数（范围60-100）产生所有同学的成绩；
 * （3）请编写代码存储学生信息（包括学生学号，成绩）；
 * （4）按照成绩从小到大的顺序输出所有学生信息。
 * */
package Temp_0503;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
    public static void main(String[] args) {
        Set<Student> s = new HashSet<>();
        for (int i=0;i<30;i++)
        {
            Student st = new Student("1706041"+1,(int)Math.random()*40+60);
            s.add(st);
        }

        Iterator it = s.iterator();
        while (it.hasNext())
        {
            Student obj = (Student) it.next();
            System.out.println(obj);
        }
    }
}
