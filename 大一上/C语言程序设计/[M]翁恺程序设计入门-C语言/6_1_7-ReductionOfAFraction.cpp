#include "stdio.h"

int main() {
    int dividend, divisor;
    int i, min, gcd;
    gcd = 1;

    printf("输入一个分数(例:1/2):");
    scanf("%d/%d", &dividend, &divisor);

    min = dividend;
    if (divisor < dividend) {
        min = divisor;
    }

    for (i=2; i<=min; i++) {
        if (divisor%i==0 && dividend%i==0) {
            gcd = i;
        }
    }

    printf("约分最简分式为:%d/%d", dividend/gcd, divisor/gcd);
}