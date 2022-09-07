import math
# 计算一元二次方程的根
a, b, c = float(input("请输入第一个数:")), float(input("请输入第二个数:")), float(input("请输入第三个数:"))
delta = math.pow(b, 2) - 4 * a * c
print("[DEBUG]delta_Valve:", delta)
if delta > 0:
    print("该方程有 2 个解")
    result1 = (-b + math.sqrt(delta)) / (2 * a)
    result2 = (-b - math.sqrt(delta)) / (2 * a)
    print(result1, result2)
elif delta < 0:
    print("该方程有 0 个解")
else:  # == 0
    print("该方程有 0 个解")
    result = (-b - math.sqrt(delta)) / (2 * a)