#include "stdio.h"

int sum(int min, int max) {
    int i;
    int sum = 0;
    for (i=min; i<=max; i++) {
        sum += i;
    }
    return sum;
}

int main() {
    int min, max;
    printf("请输入左右正整数区间:");
    scanf("%d%d", &min, &max);
    printf("总和为:%d", sum(min, max));
}