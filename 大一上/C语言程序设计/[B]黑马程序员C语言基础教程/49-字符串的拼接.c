#include "stdio.h"

int main() {
    char ch1[] = "hello";
    char ch2[] = "world";
    char ch3[11];
    int i, j;

    for (i = 0; ch1[i] != '\0'; ++i) {
        ch3[i] = ch1[i];
    }

    for (j = 0; ch2[j] != '\0'; ++j) {
        ch3[i + j] = ch2[j];
        printf("%d, ", j);
    }

    ch3[i+j] = '\0';
    printf("拼接后的字符串为:%s", ch3);

    return 0;
}