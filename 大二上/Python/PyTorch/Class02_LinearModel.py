import numpy as np
import matplotlib.pyplot as plt

x_data = [1.0, 2.0, 3.0]  # 一般指输入的样本
y_data = [2.0, 4.0, 6.0]  # 一般指输出的样本 相同的索引一般对应同一组样本


def forward(x):  # 定义一个模型
    return x * w


def loss(x, y):  # 定义损失函数
    y_pred = forward(x)
    return (y_pred - y) ** 2


# 穷举法
w_list = []  # 将权重保存到列表内 定义空列表
mse_list = []  # 将权重保存到列表内 定义空列表
for w in np.arange(0.0, 4.1, 0.1):  # 生成0.0到4.0的一个序列,间隔为0.1
    print("w=", w)
    l_sum = 0
    for x_val, y_val in zip(x_data, y_data):
        y_pred_val = forward(x_val)  # 计算预测值
        loss_val = loss(x_val, y_val)  # 计算损失值
        l_sum += loss_val
        print('\t', x_val, y_val, y_pred_val, loss_val)
    print('MSE=', l_sum / 3)  # 除以样本的总数3
    w_list.append(w)
    mse_list.append(l_sum / 3)  # 除以样本的总数3

plt.plot(w_list, mse_list)
plt.ylabel('Loss')
plt.xlabel('w')
plt.show()