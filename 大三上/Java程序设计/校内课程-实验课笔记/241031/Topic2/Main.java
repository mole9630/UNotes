package Topic2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 创建ArrayList对象
        ArrayList<Integer> list = new ArrayList<>();
        // 创建HashSet对象
        HashSet<Integer> set = new HashSet<>();
        // 创建随机数对象
        Random random = new Random();

        // 生成10个随机数
        while (list.size() < 10) {
            int num = random.nextInt(101); // 生成0~100之间的随机数
            if (!list.contains(num)) { // 判断list是否存在该元素
                list.add(num);
            }
        }

        while (set.size() < 10) {
            set.add(random.nextInt(101)); // 直接添加，HashSet自动去重
        }

        System.out.print("List: ");
        for (Integer i : list) {
            System.out.print(String.format("%d ", i));
        }
        System.out.println();
        System.out.print("Set: ");
        for (Integer i : set) {
            System.out.print(String.format("%d ", i));
        }

    }
}