/**
 * 使用List集合实现：存储一个班级的信息，包括：班级编号、班级名称、班级三个学生的记录，遍历集合元素。
 */

/
package Work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List l1=new ArrayList(); //创建一个集合
        l1.add("计科2101");
        l1.add("计算机科学与技术");
        l1.add("张三");
        l1.add("软工2102");
        l1.add("软件工程");
        l1.add("李四");
        l1.add("计科2102");
        l1.add("计算机科学与技术");
        l1.add("王五");
        Iterator it=l1.iterator(); //创建迭代器用于访问集合
        for (int i=0;it.hasNext();i++) //遍历集合
        {
            if (i%3==0) //创建分隔线
            {
                System.out.println("***********");
            }
            System.out.println(it.next()); //输出集合中的元素
        }
    }
}