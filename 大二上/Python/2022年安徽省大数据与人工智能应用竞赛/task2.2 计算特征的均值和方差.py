import math

open_file = open("material/task2_2.txt")
massage = open_file.read()

list_massage = massage.split()
# print("[debug:]", list_massage)
# print("[debug:]", len(list_massage))

# 求MaxWindSpeedMPH的均值
i = 5
sum = 0
count = 0
while(i <= 39):
    sum += int(list_massage[i])
    count += 1
    i += 5
MaxWindSpeedMPH_mean = float(sum/count)
print("MaxWindSpeedMPH的均值是:", MaxWindSpeedMPH_mean)
# print("[debug:] count:", count)

# 求MaxWindSpeedMPH的方差
i = 5
sum = 0
count = 0
while(i <= 39):
    sum += math.pow(int(list_massage[i]) - MaxWindSpeedMPH_mean, 2)
    count += 1
    i += 5
MaxWindSpeedMPH_variance = sum * (1 / count)
print("MaxWindSpeedMPH的方差是:", MaxWindSpeedMPH_variance)



# 求WindDirDegrees的均值
i = 9
sum = 0
count = 0
while(i <= 39):
    sum += int(list_massage[i])
    count += 1
    i += 5
# print("[debug:] count:", count)
WindDirDegrees_mean = float(sum/count)
print("WindDirDegrees的均值是:", WindDirDegrees_mean)

# 求WindDirDegrees的方差
i = 9
sum = 0
count = 0
while(i <= 39):
    sum += math.pow(int(list_massage[i]) - WindDirDegrees_mean, 2)
    count += 1
    i += 5
WindDirDegrees_variance = sum * (1 / count)
print("MaxWindSpeedMPH的方差是:", WindDirDegrees_variance)


# 求MeanWindSpeedMPHF标准化后的均值
#