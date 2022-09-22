import matplotlib.pyplot as plt  # 加载matplotlib用于数据的可视化
from sklearn.decomposition import PCA  # 加载PCA算法包
from sklearn.datasets import load_iris

# 加载鸢尾花数据
data = load_iris()  # 以字典形式加载数据
y = data.target  # 使用y表示数据集中的标签
x = data.data  # 使用x表示数据集的属性数据
pca = PCA(n_components=2)  # 加载PCA算法，设置降维后的维度为2
reduced_x = pca.fit_transform(x)  # 对原始数据进行降维，保存在reduced_x中
red_x, red_y = [], []
blue_x, blue_y = [], []
green_x, green_y = [], []
# 三类数据点
# 按照鸢尾花的类别进行降维处理
for i in range(len(reduced_x)):
    if y[i] == 0:
        red_x.append(reduced_x[i][0])
        red_y.append(reduced_x[i][1])
    elif y[i] == 1:
        blue_x.append(reduced_x[i][0])
        blue_y.append(reduced_x[i][1])
    else:
        green_x.append(reduced_x[i][0])
        green_y.append(reduced_x[i][1])
# 对降维后的数据可视化
plt.scatter(red_x, red_y, c='r', marker='x')
plt.scatter(blue_x, blue_y, c='b', marker='D')
plt.scatter(green_x, green_y, c='g', marker='.')
plt.show()
