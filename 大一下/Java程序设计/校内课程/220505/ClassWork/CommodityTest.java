package ClassWork;

import com.MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommodityTest {
    public static void main(String[] args) {
        //创建Map集合
        Map<Commodity, String> m1 = new HashMap<Commodity, String>();

        //添加元素
        m1.put(new Commodity("台式计算机", "电子数码", "计算机设备"), "220505001");
        m1.put(new Commodity("便携式计算机", "电子数码", "便携式计算机设备"), "220505002");
        m1.put(new Commodity("移动电话", "电子数码", "移动电话设备"), "220505003");
        m1.put(new Commodity("移动电话", "电子数码", "移动电话设备"), "220505003");

        //遍历
        Set<Commodity> st = m1.keySet();
        for (Commodity s : st) {
            String v = m1.get(s);
            System.out.println("key:" + s + ",value:" + v);
        }
    }
}

