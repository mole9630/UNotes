import matplotlib.pyplot as plt

x_data = [1.0, 2.0, 3.0]  # 一般指输入的样本
y_data = [2.0, 4.0, 6.0]  # 一般指输出的样本 相同的索引一般对应同一组样本

w = 1.0  # 初始权重猜测值


def forward(x):
    return x * w


def loss(x, y):  # 仅求一个样本的损失
    y_pred = forward(x)
    return (y_pred - y) ** 2


def gradient(x, y):  # 定义梯度求导
    return 2 * x * (x * w - y)


epoch_list = []
loss_list = []
print('predict (before training)', 4, forward(4))
for epoch in range(100):  # 训练过程 目前设置进行100轮训练
    for x, y in zip(x_data, y_data):
        grad = gradient(x, y)  # 对每一个样本求梯度
        w = w - 0.01 * grad  # 拿一个样本对其更新
        print("\tgrad:", x, y, grad)
        l = loss(x, y)  # 计算当前损失
    print("progress:", epoch, "w=", w, "loss=", l)
    epoch_list.append(epoch)
    loss_list.append(l)

print('predict (after training)', 4, forward(4))
plt.plot(epoch_list, loss_list)
plt.ylabel('loss')
plt.xlabel('epoch')
plt.show()