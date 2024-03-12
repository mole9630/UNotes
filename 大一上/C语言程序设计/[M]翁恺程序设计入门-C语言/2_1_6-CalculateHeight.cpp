#include "stdio.h"

int main() {
    float foot;
    float inch;
    float meter;
    
    printf("请输入要计算的身高(几尺几寸):");
    scanf("%f%f", &foot, &inch);
    meter = (foot + inch / 12) * 0.3048;
    printf("%.2f尺%.2f寸是%.4f米", foot, inch, meter);
}