import random

user = int(input("请输入您编号表示您出的内容(0.剪刀 1.石头 2.布):"))
computer = random.randint(0, 2)

if user == 0 and computer == 0:
    print("电脑出:剪刀,该局平局")
elif user == 0 and computer == 1:
    print("电脑出:石头,该局您输了")
elif user == 0 and computer == 2:
    print("电脑出:布,该局您获胜")
elif user == 1 and computer == 0:
    print("电脑出:剪刀,该局您获胜")
elif user == 1 and computer == 1:
    print("电脑出:石头,该局平局")
elif user == 1 and computer == 2:
    print("电脑出:布,该局您输了")
elif user == 2 and computer == 0:
    print("电脑出:剪刀,该局您输了")
elif user == 2 and computer == 1:
    print("电脑出:石头,该局您获胜")
elif user == 2 and computer == 2:
    print("电脑出:布,该局平局")