import math

open_file = open("material/task2_2.txt")
massage = open_file.read()

list_massage = massage.split()
# print("[debug]", list_massage)
# print("[debug]", len(list_massage))

# 求MaxWindSpeedMPH的均值
i = 5
sum = 0
count = 0
while i <= 39:
    sum += int(list_massage[i])
    count += 1
    i += 5
MaxWindSpeedMPH_mean = float(sum / count)
print("MaxWindSpeedMPH的均值是:", MaxWindSpeedMPH_mean)
# print("[debug] count:", count)

# 求MaxWindSpeedMPH的方差
i = 5
sum = 0
count = 0
while i <= 39:
    sum += math.pow(int(list_massage[i]) - MaxWindSpeedMPH_mean, 2)
    count += 1
    i += 5
MaxWindSpeedMPH_variance = sum * (1 / count)
print("MaxWindSpeedMPH的方差是:", MaxWindSpeedMPH_variance)

# 求WindDirDegrees的均值
i = 9
sum = 0
count = 0
while i <= 39:
    sum += int(list_massage[i])
    count += 1
    i += 5
# print("[debug] count:", count)
WindDirDegrees_mean = float(sum / count)
print("WindDirDegrees的均值是:", WindDirDegrees_mean)

# 求WindDirDegrees的方差
i = 9
sum = 0
count = 0
while i <= 39:
    sum += math.pow(int(list_massage[i]) - WindDirDegrees_mean, 2)
    count += 1
    i += 5
WindDirDegrees_variance = sum * (1 / count)
print("MaxWindSpeedMPH的方差是:", WindDirDegrees_variance)


# 求MeanWindSpeedMPHF标准化的值
i = 6
count = 0
list_MeanWindSpeedMPHF = []
list_MeanWindSpeedMPHF_standardization = []
while i <= 39:
    list_MeanWindSpeedMPHF.append(list_massage[i])
    i += 5
i = 0
# 将列表内的数据转为整型
# 方法1
list_MeanWindSpeedMPHF_sort = list(map(int, list_MeanWindSpeedMPHF))
# 方法2
# list_MeanWindSpeedMPHF_sort = []
# for i in list_MeanWindSpeedMPHF:
#     list_MeanWindSpeedMPHF_sort.append(int(i))
list_MeanWindSpeedMPHF_sort.sort()  # 将数据进行排序
while i <= 6:
    list_MeanWindSpeedMPHF_standardization.append((list_MeanWindSpeedMPHF_sort[i] - min(list_MeanWindSpeedMPHF_sort)) / (max(list_MeanWindSpeedMPHF_sort) - min(list_MeanWindSpeedMPHF_sort)))
    i += 1

# print("[debug] list_MeanWindSpeedMPHF_sort:", list_MeanWindSpeedMPHF_sort)
# print("[debug] list_MeanWindSpeedMPHF_standardization:", list_MeanWindSpeedMPHF_standardization)

# 求MeanWindSpeedMPHF标准化后的均值
i = 0
sum = 0
while i <= 6:
    sum += list_MeanWindSpeedMPHF_standardization[i]
    i += 1
list_MeanWindSpeedMPHF_standardization_mean = float(sum / len(list_MeanWindSpeedMPHF_standardization))
print("MeanWindSpeedMPHF标准化后的均值是:", list_MeanWindSpeedMPHF_standardization_mean)