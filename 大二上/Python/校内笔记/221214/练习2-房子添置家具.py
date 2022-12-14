# 练习2-房子添置家具
"""
     1. 房子类:户型 面积 剩余面积 添加家具行为
     2. 家具类:名称 价格 占地面积
"""


class House:  # 房子类
    def __init__(self, house_type, area):
        self.house_type = house_type
        self.area = area
        self.left_area = area  # 剩余面积 初始化时,剩余面积=总面积
        self.furniture = []  # 家具列表

    def add_furniture(self, obj):  # 添加家具行为
        if obj.area > self.left_area:
            print(f"{obj.name}太大了, 占地面积:{obj.area}, 剩余面积:{self.left_area}, 无法添加")
            return
        self.furniture.append(obj.name)  # 将家具名称添加到家具列表中
        self.left_area -= obj.area  # 剩余面积 = 剩余面积 - 家具占地面积
        print(f"要添加的家具:{obj.name}, 占地面积:{obj.area}, 剩余面积:{self.left_area}")

    def __str__(self):
        return f"户型:{self.house_type}, 总面积:{self.area}, 剩余面积:{self.left_area}, 家具列表:{self.furniture}"


class Furniture:  # 家具类
    def __init__(self, name, area):
        self.name = name
        self.area = area

    def __str__(self):
        return f"家具名称:{self.name},占地面积:{self.area}"


table = Furniture("餐桌", 2)
sofa = Furniture("沙发", 4)
bed = Furniture("床", 5)
tv = Furniture("72寸电视", 72)

house = House("二室一厅", 60)
house.add_furniture(table)
house.add_furniture(sofa)
house.add_furniture(bed)
house.add_furniture(tv)
print(house)

house2 = House("三室一厅", 100)
house2.add_furniture(table)
house2.add_furniture(sofa)
house2.add_furniture(bed)
house2.add_furniture(tv)
print(house2)