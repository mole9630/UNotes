#include "stdio.h"

bool isPrime(int num) {
    int i;

    for (i=2; i<num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    int a, b;
    int i, j;
    int sum = 0;

    printf("请输入左右区间:");
    scanf("%d%d", &a, &b);
    if (a==1) {
        a = 2;
    }

    for (i=a; i<=b; i++) {
        if (isPrime(i)) {
            sum += i;
        }
    }
    printf("这些素数总和为:%d", sum);
}