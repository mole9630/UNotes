#include "stdio.h"

int main() {
    int arr[100];
    int i, count;
    float avg, sum;
    i = 0, count = -1, sum = 0;


    while (arr[i-1] != -1) {
        scanf("%d", &arr[i]);
        i++;
        count++;
    }

    for (i=0; i<=count-2; i++) {
        sum += arr[i];
    }
    avg = sum / count;

    printf("比平均数大的数有:");
    for (i=0; i<=count-2; i++) {
        if (arr[i] > avg) {
            printf("%d ", arr[i]);
        }
    }
}