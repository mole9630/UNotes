package mole;

public class Chicken {
    public static void main(String[] args) {
        /**
         * 编程实现:100只鸡,100分钱,母鸡3分钱/只,小鸡1分钱3只,求一百分钱买100只鸡,有多少只母鸡,多少只小鸡
         */
        int i=0,j=0,small,big;
        for (i=0;i<=100/3;i++) //i控制母鸡个数
        {
            for(j=0;j<=100/1;j++) //控制小鸡个数
                //当i+j==100 则正好100只鸡 并且3*i + j/3==100
            {
                if (i+j==100 && 3*i+j/3==100)
                {
                    System.out.println("母鸡共:" + i + "只 小鸡共:" + j +"只");
                }
            }
        }
    }
}