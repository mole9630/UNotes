/**
 * 在一场名为Game的游戏中,作为玩家的你手头拥有若干个金币.为增加生命力,你需要购买仙女草和银河梭两件宝物.
 * 其中仙女草售价为16个金币,可增加玩家30个单位的生命力;
 * 银河梭售价为16个金币,能增加玩家20个单位的生命力;
 * 求出一种最佳购买方案,使得用你的金币购买的宝物能够最大限度地增加你的生命力(不一定要用完金币)
 * 并输入最佳方案中每位宝物的购买数量*/
package mole;

import java.util.Scanner;

public class Game {
    static final int FGVALUE = 20; //定义仙女草的售价
    static final int GSVALUE = 16; //定义银河梭的售价
    static final int FGLIFE = 30; //定义仙女草增加的生命力
    static final int GSLIFE = 20; //定义银河梭增加的生命力
    public static void main(String[] args) {
        int goldcoin = 100; //定义金币的数量
        int fg_num=0, gs_num=0; //定义仙女草与银河梭的数量
        int max_life = 0; //定义最大生命力
        System.out.println("请输入金币的数量:");
        Scanner in = new Scanner(System.in);
        goldcoin = in.nextInt();
        for (int fg_loop=0; fg_loop<=(goldcoin/FGVALUE); fg_loop++)
        {
            for (int gs_loop=0; gs_loop<=(goldcoin/GSVALUE); gs_loop++)
            {
                if (((fg_loop*FGVALUE+gs_loop*GSVALUE)<=goldcoin) && ((FGLIFE*fg_loop+GSLIFE*gs_loop)>max_life))
                {
                    fg_num = fg_loop; //记录仙女草的数量
                    gs_num = gs_loop; //记录银河梭的数量
                    max_life = FGLIFE*fg_loop+GSLIFE*gs_loop;
                }
            }
            System.out.println("购买的宝物最多能增加你" + max_life + "个生命力!");
            System.out.println("购买仙女草的数量为:" + fg_num);
            System.out.println("购买银河梭的数量为:" + gs_num);
        }
    }
}
