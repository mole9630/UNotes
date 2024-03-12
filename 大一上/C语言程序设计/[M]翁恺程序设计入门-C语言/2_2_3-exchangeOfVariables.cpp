#include "stdio.h"

int main() {
    int a = 5;
    int b = 10;
    int temp;

    printf("原始值:a=%d, b=%d\n", a, b);

    temp = a;
    a = b;
    b = temp;

    printf("交换后:a=%d, b=%d", a, b);
}