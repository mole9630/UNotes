#include "stdio.h"

int main() {
    int a;
    int i, j, k;
    int count;
    count = 0;

    printf("请输入一个不超过6的正整数:");
    scanf("%d", &a);

    for (i=a; i<=a+3; i++) {
        for (j=a; j<=a+3; j++) {
            for (k=a; k<=a+3; k++) {
                count++;
                printf("%d%d%d ", i, j, k);
                if (count == 6) { // 每六个换行一次
                    printf("\n");
                    count = 0;
                }
            }
        }
    }
}