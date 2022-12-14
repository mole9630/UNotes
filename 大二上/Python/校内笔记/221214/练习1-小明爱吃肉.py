# 练习1:小明爱吃肉
"""
    现在体重:140斤
    1.跑步1小时,减肥0.5斤
    2.吃一碗肉       ,体重增加1斤
"""


class Person:
    def __init__(self, name, weight):
        self.name = name
        self.weight = weight

    def run(self, hour):
        self.weight -= 0.5 * hour
        print(f"{self.name}跑步{hour}小时,减肥{0.5 * hour}斤,体重为{self.weight}斤")

    def eat(self, meat):
        self.weight += 1 * meat
        print(f"{self.name}吃了{meat}碗肉,增肥{1 * meat}斤,体重为{self.weight}斤")

    def __str__(self):
        return f"我的名字是{self.name},现在体重是{self.weight}斤"


xiaoming = Person("小明", 140)
xiaoming.run(4)  # 小明跑步4小时,减肥2斤,体重为138斤
xiaoming.eat(2)  # 小明吃了2碗肉,增肥2斤,体重为140斤
xiaoming.run(4)  # 小明跑步4小时,减肥2斤,体重为138斤
print(xiaoming)

print("------------------------")

xiaowang = Person("小王", 150)
xiaowang.run(5)  # 小王跑步5小时,减肥2.5斤,体重为147.5斤
xiaowang.eat(1)  # 小王吃了1碗肉,增肥1斤,体重为148.5斤
print(xiaowang)