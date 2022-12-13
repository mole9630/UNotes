# 练习3-将乘法表写入文件中
text = []
with open('test4.1.txt', 'w', encoding='utf-8') as file4_1:
    for i in  range(1, 10):
        for j in  range(1, i+1):
            text.append(f'{j} * {i} = {i*j}\t')
        text.append('\n')
    file4_1.writelines(text)

# 老师方法
with open('test4.2.txt', 'w', encoding='utf-8') as file4_2:
    for i in  range(1, 10):
        for j in  range(1, i+1):
            file4_2.write(f'{j} * {i} = {i*j}\t')
        file4_2.write('\n')