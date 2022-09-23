import matplotlib.pyplot as plt  # 加载matplotlib用于数据的可视化
import numpy as np
from scipy.spatial.distance import cdist
from sklearn.cluster import KMeans
from sklearn.decomposition import PCA  # 加载PCA算法包
import pandas as pd

# 读取数据
data = pd.read_csv("material/task3_1.csv")
# print(data.head(10))

# 对数据降维处理
pca = PCA(n_components=2)  # 加载PCA算法，设置降维后的维度为2
reduced_x = pca.fit_transform(data)  # 对原始数据进行降维，保存在reduced_x中
# print(reduced_x)  # 查看降维后的数据

# 降维数据可视化
plt.scatter(reduced_x[:, 0], reduced_x[:, 1],marker='o')
plt.show()

# 对降维后的数据进行聚类
K = range(1, 11)
meandistortions = []
for k in K:
    kmeans = KMeans(n_clusters=k)
    kmeans.fit(reduced_x)
    # 计算各个点分别到k个质心的距离,取最小值作为其到所属质心的距离,并计算这些点到各自所属质心距离的平均距离
    meandistortions.append(
        sum(
            np.min(cdist(reduced_x, kmeans.cluster_centers_, 'euclidean'), axis=1)
        ) / reduced_x.shape[0]
    )

# 绘制碎石图
# plt.plot(K, meandistortions, 'bx--')
# plt.xlabel('k')
# plt.show()


k_means = KMeans(init='k-means++', n_clusters=2, max_iter=500)  # init='k-means++'表示用kmeans++的方法来选择初始质数 n_clusters=8表示数据聚为8类 max_iter=500表示最大的迭代次数是500(缺省300)
k_means.fit(reduced_x)
label = k_means.fit_predict(reduced_x)  # 聚类后的聚类标签放在label内
print(label)

# 数据可视化
blue_x, blue_y = [], []
green_x, green_y = [], []
# 三类数据点
# 按照鸢尾花的类别进行降维处理
for i in range(len(reduced_x)):
    if label[i] == 0:
        blue_x.append(reduced_x[i][0])
        blue_y.append(reduced_x[i][1])
    else:
        green_x.append(reduced_x[i][0])
        green_y.append(reduced_x[i][1])
# 对降维后的数据可视化
plt.scatter(blue_x, blue_y, c='b', marker='D')
plt.scatter(green_x, green_y, c='g', marker='x')
plt.show()
