#include "stdio.h"

int main() {
    int n, i;
    float dividend, divisor, temp;
    float sum;
    sum = 0;
    dividend = 2;
    divisor = 1;

    printf("输入一个正整数:");
    scanf("%d", &n);

    for (i=1; i<=n; i++) {
        sum += dividend/divisor;
        temp = dividend; //保存分子变量
        dividend = dividend + divisor;
        divisor = temp;
    }

    printf("%.2f", sum);
}