import math
# 计算直角三角形的斜边
side_length1, side_length2 = float(input("请输入第一个边长:")), float(input("请输入第二个边长:"))
hypotenuse = math.sqrt(math.pow(side_length1, 2) + math.pow(side_length2, 2))  # sqr为开根函数
print("斜边为:", hypotenuse)