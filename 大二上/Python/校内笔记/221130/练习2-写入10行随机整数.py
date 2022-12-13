#练习二-往文件中写入10行随随机整数(1-100)
import random

with open('test3.1.txt', 'w', encoding='utf-8') as file3_1:
    randomList = []
    for i in range(10):
        num = random.randint(1, 100)
        randomList.append(str(num) + "\n")
    file3_1.writelines(randomList)

# 老师方法
with open('text3.2.txt', 'w', encoding='utf-8') as file3_2:
    for i in range(10):
        # file3_2.write(str(random.randint(1, 100) + '\n'))
        file3_2.write(f'{random.randint(1, 100)}\n')  # 将内容格式化

# 老师方法
with open('text3.3.txt', 'w', encoding='utf-8') as file3_3:
    list1 = [str(random.randint(1, 100)) + '\n' for i in range(10)]
    file3_3.writelines(list1)