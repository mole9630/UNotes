#include <cmath>
#include "stdio.h"

int main() {
    int i;
    int ones, tens, hundreds;

    printf("水仙花数有:");
    for (i=100; i<=999; i++) {
        ones = i % 10;
        tens = i / 10 % 10;
        hundreds = i / 10 / 10;

        if (i == pow(ones, 3)+pow(tens, 3)+ pow(hundreds, 3)) {
            printf("%d ", i);
        }
    }

}