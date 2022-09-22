import random
import pandas as pd
import numpy as np
from sklearn.cluster import KMeans
from sklearn import preprocessing
from sklearn.preprocessing import StandardScaler
from scipy.spatial.distance import cdist  # 计算距离
import matplotlib.pyplot as plt  # 绘图


def savaData(filePath, data):
    '''
    用于保存输出结果到指定路径下
    :param filePath: 保存结果的目的文件路径
    :param data: 结果数据
    :return:
    '''
    file = open(filePath, 'w+', encoding='utf-8')  # 注意规定编码格式
    file.write(str(data))  # 写入结果数据
    file.close()


# 读取数据并删除非数为聚类做准备
df = pd.read_excel('material/task3_1 food1.xlsx')  # 读入表格数据
df1 = df.dropna()  # 删除含有数据缺失的行
# print(df1.head())  # 输出表格前5行`
data = df1.drop('食物名', axis=1, inplace=False)  # 删除'食物名'列 axis=0代表删除行,1代表删除列 inplace=False代表不改变原表 True代表改变原表
data = data.drop('序号', axis=1, inplace=False)  # 删除'序号'列
# print(data.head())


# 数据标准化
z_scaler = preprocessing.StandardScaler()
data_z = z_scaler.fit_transform(data)
data_z = pd.DataFrame(data_z)


# 数据归一化
minmax_scale = preprocessing.MinMaxScaler().fit(data_z)
dataa = minmax_scale.transform(data_z)
print(pd.DataFrame(dataa).head())


K = range(1, 11)

meandistortions = []
for k in K:
    kmeans = KMeans(n_clusters=k)
    kmeans.fit(dataa)
    # 计算各个点分别到k个质心的距离,取最小值作为其到所属质心的距离,并计算这些点到各自所属质心距离的平均距离
    meandistortions.append(
        sum(
            np.min(cdist(dataa, kmeans.cluster_centers_, 'euclidean'), axis=1)
        ) / dataa.shape[0]
    )


# 绘制碎石图
plt.plot(K, meandistortions, 'bx--')
plt.xlabel('k')
plt.show()


k_means = KMeans(init='k-means++', n_clusters=8, max_iter=500)  # init='k-means++'表示用kmeans++的方法来选择初始质数 n_clusters=8表示数据聚为8类 max_iter=500表示最大的迭代次数是500(缺省300)
k_means.fit(dataa)
label = k_means.fit_predict(dataa)  # 聚类后的聚类标签放在label内
# print(label)


data1 = df1['食物名']
data2 = data1.values


# 查看聚类结果
dat_type = pd.DataFrame(label)  # 将模型结果导出为数据表
dat_type.columns = ['类_别']  # 设置列名
dat = pd.merge(df1, dat_type, left_index=True, right_index=True)  # 合并类别表和数据表
# print(dat)
pd.set_option('display.max_rows', None)
dat.sort_values('类_别')  # 按类别进行排序
# print(dat.head(10))


# 储存聚类结果
FoodCluster = [[], [], [], [], [],[], [], []]  # 分为8类
for i in range(len(data2)):
    FoodCluster[label[i]].append(data2[i])

resultStr = ''  # 保存分类结果
# 输出分类结果
for i in range(len(FoodCluster)):
    print(FoodCluster[i])
    # 将同分类食物用,拼接
    resultStr = resultStr + ','.join(FoodCluster[i]) + '\n'
savaData('resultF.csv', resultStr)



#  由于第五类分类不明 决定重新对第4类进行kmeans分类
data2 = dat.loc[dat['类_别'] == 3]  # 提取第4类
dat2 = dat.drop('食物名', axis=1, inplace=False)  # 删除'食物名'列 axis=0代表删除行,1代表删除列 inplace=False代表不改变原表 True代表改变原表
dat2 = dat2.drop('序号', axis=1, inplace=False)  # 删除'序号'列

# 数据标准化
z_scaler2 = preprocessing.StandardScaler()
data_z2 = z_scaler2.fit_transform(dat2)
data_z2 = pd.DataFrame(data_z)

# 数据归一化
minmax_scale2 = preprocessing.MinMaxScaler().fit(data_z)
dataa2 = minmax_scale2.transform(data_z2)
print(pd.DataFrame(dataa2).head())

# 将数据重新聚为2类
k_means2 = KMeans(n_clusters=2)  # 聚为2类
k_means2.fit(dataa2)
label2 = k_means2.fit_predict(dataa2)

datt = data2['食物名']
datt2 = datt.values
# 储存聚类结果
FoodCluster2 = [[], []]
for i in  range(len(datt)):
    FoodCluster2[label2[i]].append(datt2[i])

resultStr = ''  # 保存分类结果
# 输出分类结果
for i in range(len(FoodCluster2)):
    print(FoodCluster2[i])
    # 将同分类食物用,拼接
    resultStr = resultStr + ','.join(FoodCluster2[i]) + '\n'
savaData('resultF2.csv', resultStr)