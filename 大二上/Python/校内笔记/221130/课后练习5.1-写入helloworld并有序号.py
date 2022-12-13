# 方法1
with open('test5_1.txt', 'w', encoding='utf-8') as file:
    for i in range(5):
        file.write('Hello World' + str(i) + "\n")

# 方法2
text = []
with open('test5_2.txt', 'w', encoding='utf-8') as file:
    for i in range(5):
        text.append('Hello World' + str(i) + "\n")
    file.writelines(text)