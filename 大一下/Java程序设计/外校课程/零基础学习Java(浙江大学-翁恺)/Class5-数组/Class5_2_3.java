/**
 * 素数
 */
package Study;

import java.util.Scanner;

public class Class5_2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] primes = new int[50];
        primes[0] = 2;
        int x,cnt = 1;
        boolean isPrime = true;
        MAIN_LOOP:
        for (x=3;cnt<50;x++)
        {
            for (int i=0;i<cnt;i++)
            {
                if (x % primes[i] ==0)
                {
                    continue MAIN_LOOP;
                }
            }
            primes[cnt++] = x; //下一次将素数x写入到prime数组的下一个数组元素位置
        }
        for (int k: primes)
        {
            System.out.print(k + " ");
        }

        /**
         * 构造素数表
         * 欲购造n以内(不含)的素数表
         * 1.创建prime为Boolean[n],初始化其所有元素为true,prime[x]为true表示x是素数
         * 2.令x=2
         * 3.如果x是素数,则对于(i=2;x*i<n;i++)令prime[i*x]=false
         * 4.令++,如果x<n,重复3,否则结束
         */
        System.out.println("\n**** 构造素数表 ****");
        boolean[] _isPrime = new boolean[100];
        for (int i=0;i<_isPrime.length;i++)
        {
            _isPrime[i] = true;
        }
        for (int i=2;i<_isPrime.length;i++)
        {
            if (_isPrime[i])
            {
                for (int k=2;i*k<_isPrime.length;k++)
                {
                    _isPrime[i*k] = false;
                }
            }
        }
        for (int i=2;i<_isPrime.length;i++)
        {
            if (_isPrime[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}
