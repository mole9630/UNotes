/**
 * 数组的遍历
 */
package Study;

import java.util.Scanner;

public class Class5_2_2 {
    public static void main(String[] args) {
        //在一组给定的数据中,如何找出某个数据是否存在?
        Scanner in = new Scanner(System.in);
        int[] data = {3,2,5,7,4,9,11,34,12,28};
        int x = in.nextInt();
        int loc = -1;
        boolean found = false;
        for (int i=0;i<data.length;i++) //数组的遍历
        {
            if(x == data[i])
            {
                loc = i;
                break;
            }
        }
        for (int k:data) // for-each循环 对于data这个数组当中的每个元素,循环的每一轮拿出来作为k
        {
            if (k == x)
            {
                found = true;
                break;
            }
        }
        if (loc > -1)
        {
            System.out.println(x + "是第" + (loc+1) + "个");
        }
        else
        {
            System.out.println(x + "不在其中");
        }
    }
}
