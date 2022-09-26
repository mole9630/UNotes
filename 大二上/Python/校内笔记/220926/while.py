# while循环又称条件循环
# 求100以内能被7或7整除,但不能同时被3和7整除的数
i = 0
while i <= 100:
    # i += 1
    if (i % 3 == 0 or i % 7 == 0) and not (i % 3 == 0 and i % 7 == 0):
        print(i)
    i += 1

# 1~100累加和
i, sum = 0, 0
while i <= 100:
    sum += i
    i += 1
print("1~100的累加和为:", sum)

# 1~100偶数累加和
i, sum = 0, 0
while i <= 100:
    if i % 2 == 0:
        sum += i
    i += 1
    # i += 2
print("1~100的偶数累加和为:", sum)

# 1~100奇数累加和
i, sum = 0, 0
while i <= 100:
    if i % 2 != 0:  # 不能整除2即奇数
        sum += i
    i += 1
    # i += 2
print("1~100的奇数累加和为:", sum)

# 求5的阶乘
i, sum = 5, 1
while i > 0:
    sum *= i
    i -= 1
print("5的阶乘为:", sum)

# 求1~100的阶乘相加
