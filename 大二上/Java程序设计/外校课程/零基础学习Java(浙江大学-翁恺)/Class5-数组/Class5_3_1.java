/**
 * 二维数组
 */
package Study;

import java.util.Scanner;

public class Class5_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][5]; //定义一个二维数组
        int[][] b =
                {
                        {1,2,3,4},
                        {1,2,3},
                }; //二维数组的初始化 -编译器来数 每行一个{} 逗号分隔 最后的逗号可以存在(古老的传统) 如果省略则补零.
        for (int i=0;i<3;i++) //对[3][5]的二维数组的遍历
        {
            for (int j=0;j<5;j++)
            {
                a[i][j] = i*j; //a[i,n]是非法的
            }
        }

        //tic-tac-toe游戏
        //胜利结束条件:行上3个相同,列上3个相同,对角线上3个相同,反对角线上3个相同
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        boolean gotResult = false;
        int numOfX = 0;
        int numOfO = 0;
        //读入矩阵
        for (int i=0;i<board.length;i++)
        {
            for (int j=0;j<board[i].length;j++)
            {
                board[i][j] = in.nextInt();
            }
        }
        //检查行
        for (int i=0;i<SIZE;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if (board[i][j] == 1)
                {
                    numOfX ++;
                }
                else
                {
                    numOfO ++;
                }
                if (numOfX == SIZE || numOfO == SIZE)
                {
                    gotResult = true;
                    break;
                }
            }
        }

        //检查列
        if (!gotResult)
        {
            numOfX = 0;
            numOfO = 0;
        for (int i=0;i<SIZE;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if (board[j][i] == 1)
                {
                    numOfX ++;
                }
                else
                {
                    numOfO ++;
                }
                if (numOfX == SIZE || numOfO == SIZE)
                {
                    gotResult = true;
                    break;
                }
            }
        }
        }

        //检查对角线
        if (!gotResult)
        {
            numOfX = 0;
            numOfO = 0;
            for (int i=0;i<SIZE;i++)
            {
                if (board[i][SIZE-i-1] == 1)
                {
                    numOfX++;
                }
                else
                {
                    numOfO++;
                }
            }
            if (numOfX == SIZE || numOfO == SIZE)
            {
                gotResult = true;
            }
        }

        //判断结果
        if (gotResult)
        {
            if (numOfX == SIZE)
            {
                System.out.println("玩家A 胜利!");
            }
            else if (numOfO == SIZE)
            {
                System.out.println("玩家B 胜利!");
            }
            else
            {
                System.out.println("平局");
            }
        }
    }
}
