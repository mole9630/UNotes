package Topic1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 创建ArrayList对象
        ArrayList<String> list = new ArrayList<>();
        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("HELLO");
        list.add("WORD");

        // 删除指定元素
        list.remove("world");

        // 遍历ArrayList
        for (String s : list) {
            System.out.print(String.format("%s ", s));
        }
        System.out.println();

        // 替换hello
        int index = list.indexOf("hello");
        if (index != -1) {
            list.set(index, "nihao");
        }
        // 遍历ArrayList
        for (String s : list) {
            System.out.print(String.format("%s ", s));
        }
    }
}
