/**
 * 在ArrayList集合中添加元素：apple、grape、banana、pear 。输出该集合中最大元素、最小元素以及ArrayList元素的排序结果。（提示：查阅相关方法）
 */

/
package Work;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList(); //创建ArrayList对象
        l1.add("apple");
        l1.add("grape");
        l1.add("banana");
        l1.add("pear");
        System.out.println("最大元素为:" + Collections.max(l1)); //输出最大元素
        System.out.println("最小元素为:" + Collections.min(l1)); //输出最小元素
        Collections.sort(l1); //对ArrayList进行排序
        System.out.println("排序后:" + l1); //输出排序后的ArrayList
    }
}


