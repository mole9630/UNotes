#include "stdio.h"

int main() {
    int sum, count, num;
    count = 0;
    printf("请输入一组数字以空格或回车隔开, 以-1为结束:");
    scanf("%d", &num);
    while (num != -1) {
        sum += num;
        count++;
        scanf("%d", &num);
    }

    printf("这%d个数的平均数为:%.2f", count, 1.0*sum/count);
}