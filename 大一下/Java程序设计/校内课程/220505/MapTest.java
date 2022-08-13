package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        //创建Map集合
        Map<String, String> m1 = new HashMap<String, String>();

        //添加元素
        m1.put("杭州", "西湖");
        m1.put("上海", "东方明珠");
        m1.put("上海", "城隍庙"); //如果添加的元素的key相同,将使用后者的value值替换前面的值
        m1.put("上海", "外滩");
        m1.put("南京", "城隍庙");
        m1.put("黄山", "黄山");

        //获取所有的值-value()
        System.out.println("***** 获取所有的值-value() *****");
//        for (String value : m1.values())
//        {
//            System.out.println(value);
//        }
        Collection<String> c1 = m1.values(); //值
        for (String s : c1) {
            System.out.println(s);
        }

        //获取所有的键(key) --> 遍历HashMap
        System.out.println("\n***** 获取所有的键(key) *****"); //key值不可重复
        Set<String> st = m1.keySet();
        for (String s : st) {
            String v = m1.get(s); //取值
            System.out.println("key:" + s + ",value:" + v);
        }
        MapTest mt = new MapTest();
        m1.put("武汉","汉口江滩");
        mt.show(m1);
        m1.remove("黄山");
        mt.show(m1);
        System.out.println(m1.containsKey("南京")); //true 查询是否包含"南京"key
        System.out.println(m1.containsValue("西湖")); //true 查询是否包含"西湖"value
        System.out.println(m1.isEmpty()); //false 判断m1是否为空
        System.out.println(m1.size()); //4 查询有几个元素
        m1.clear(); //清除m1的所有内容
        System.out.println(m1.isEmpty()); //true
        mt.show(m1);
    }

    //遍历HashMap
    public void show(Map m1)
    {
        System.out.println("\n***** 遍历HashMap *****");
        Set<Map.Entry<String, String>> set = m1.entrySet(); //返回的是键值对(key,value)
        for (Map.Entry<String, String> entry : set) {
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }
    }
}