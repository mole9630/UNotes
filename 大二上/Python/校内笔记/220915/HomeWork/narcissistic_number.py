import math

i = int(input("请输入一个三位整数:"))
b = int(i / 100)
s = int(i / 10 % 10)
g = int(i % 10)
if i == math.pow(b, 3) + math.pow(s, 3) + math.pow(g, 3):
    print("\"%d\"是水仙花数\n" % i)
else:
    print("\"%d\"不是水仙花数\n" % i)
i += 1
