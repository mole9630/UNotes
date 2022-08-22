import matplotlib.pyplot as plt

x_data = [1.0, 2.0, 3.0]  # 一般指输入的样本
y_data = [2.0, 4.0, 6.0]  # 一般指输出的样本 相同的索引一般对应同一组样本

w = 1.0  # 初始权重猜测值


def forward(x):  # 定义计算 y = w*x
    return x * w


def cost(xs, ys):  # 计算MSE的目标函数
    cost = 0
    for x, y in zip(xs, ys):
        y_pred = forward(x)
        cost += (y_pred - y) ** 2
    return cost / len(xs)


def gradient(xs, ys):  # 计算梯度的目标函数
    grad = 0
    for x, y in zip(xs, ys):
        grad += 2 * x * (x * w - y)
    return grad / len(xs)


epoch_list = []
cost_list = []
print('predict (before training)', 4, forward(4))
for epoch in range(100):  # 训练过程 目前设置进行100轮训练
    cost_val = cost(x_data, y_data)  # 求当前损失值
    grad_val = gradient(x_data, y_data)  # 求当前梯度
    w -= 0.01 * grad_val  # 0.01 为学习率
    print('epoch:', epoch, 'w=', w, 'loss=', cost_val)  # 输出训练日志
    epoch_list.append(epoch)
    cost_list.append(cost_val)

print('predict (after training)', 4, forward(4))
plt.plot(epoch_list, cost_list)
plt.ylabel('cost')
plt.xlabel('epoch')
plt.show()