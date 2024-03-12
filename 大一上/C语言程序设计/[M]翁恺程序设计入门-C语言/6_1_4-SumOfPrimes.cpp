#include "stdio.h"

int main() {
    int min, max;
    int count, sum;
    int i, j;
    bool flag;
    count = 0, sum =0;

    printf("请输入左右正整数区间:");
    scanf("%d%d", &min, &max);

    if (min < 2) {
        min = 2;
    }

    for (i=min; i<=max; i++) {
        flag = true;
        for (j=2; j<i; j++) {
            if (i%j==0) { //能出尽, 代表不是素数
                flag = false;
                break;
            }
        }
        if (flag) {
            count++;
            sum += i;
        }
    }
    printf("%d~%d内共%d个素数，和为:%d", min, max, count, sum);
}