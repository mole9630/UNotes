#include "stdio.h"

int main() {
    int i, j;
    for (i=1; i<=9; i++) {
        for (j=1; j<=i; j++) {
            printf("%d*%d=%d", j, i, i*j);
            if (i*j < 10) {
                printf("  ");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }
}