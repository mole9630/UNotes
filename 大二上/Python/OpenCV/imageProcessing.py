import cv2  # opencv读取的图像是BGR格式 cv2则是opencv的库
import matplotlib.pyplot as plt  # 绘图展示的库
import numpy as np  # 基本的数值计算数据包

# 图像阈值
'''
① ret, dst = cv2.threshold(src, thresh, maxval, type)
    src： 输入图,只能输入单通道图像,通常来说为灰度图
    thresh： 阈值
    dst： 输出图
    ret： 阈值
    maxval： 当像素值超过了阈值 ( 或者小于阈值,根据 type 来决定 ),所赋予的值
    type：二值化操作的类型,包含以下5种类型：
    cv2.THRESH_BINARY           超过阈值部分取maxval ( 最大值 ),否则取0
    cv2.THRESH_BINARY_INV       THRESH_BINARY的反转
    cv2.THRESH_TRUNC            大于阈值部分设为阈值,否则不变
    cv2.THRESH_TOZERO           大于阈值部分不改变,否则设为0
    cv2.THRESH_TOZERO_INV       THRESH_TOZERO的反转
'''
img = cv2.imread('material/imgExample.png', cv2.IMREAD_COLOR)
img_gray = cv2.imread('material/imgExample.png', cv2.IMREAD_GRAYSCALE)
ret, thresh1 = cv2.threshold(img_gray, 127, 255, cv2.THRESH_BINARY)  # 所有大于127的全变为白色,相反变成纯黑
print(ret)
ret, thresh2 = cv2.threshold(img_gray, 127, 255,
                             cv2.THRESH_BINARY_INV)  # THRESH_BINARY_INV 相对 THRESH_BINARY 黑的变成白的,白的变成黑的
print(ret)
ret, thresh3 = cv2.threshold(img_gray, 127, 255, cv2.THRESH_TRUNC)  # >127的部分将等于127,小于127的部分不变
print(ret)
ret, thresh4 = cv2.threshold(img_gray, 127, 255, cv2.THRESH_TOZERO)
print(ret)
ret, thresh5 = cv2.threshold(img_gray, 127, 255, cv2.THRESH_TOZERO_INV)
print(ret)

titles = ['original Image', 'BINARY', 'BINARY_INV', 'TRUNC', 'TOZERO', 'TOZERO_INV']
images = [img, thresh1, thresh2, thresh3, thresh4, thresh5]

for i in range(6):
    plt.subplot(2, 3, i + 1), plt.imshow(images[i], 'gray')
    plt.title(titles[i])
    plt.xticks([]), plt.yticks([])
plt.show()

# 图像平滑处理
img = cv2.imread('material/imgExample.png')
cv2.imshow('img', img)
cv2.waitKey(0)
cv2.destroyAllWindows()
# 均值滤波
# 简单的平均卷积操作,方框中的值相加,取平均,替换掉中心204的值
blur = cv2.blur(img, (3, 3))  # (3,3) 为核的大小,通常情况核都是奇数 3、5、7
cv2.imshow('blur', blur)
cv2.waitKey(0)
cv2.destroyAllWindows()
# 方框滤波
# 基本和均值一样,可以选择归一化
# 在 Python 中 -1 表示自适应填充对应的值,这里的 -1 表示与颜色通道数自适应一样
box = cv2.boxFilter(img, -1, (3, 3), normalize=True)  # 方框滤波如果做归一化,得到的结果和均值滤波一模一样
cv2.imshow('box', box)
cv2.waitKey(0)
cv2.destroyAllWindows()
# 方框滤波
# 基本和均值一样,可以选择归一化,容易越界
box = cv2.boxFilter(img, -1, (3, 3), normalize=False)  # 若一旦发生越界,越界的值全取255
cv2.imshow('box', box)
cv2.waitKey(0)
cv2.destroyAllWindows()

# 高斯滤波
# 越接近均值时,它的概率越大
# 离中心值越近的,它的权重越大,离中心值越远的,它的权重越小。
aussian = cv2.GaussianBlur(img, (5, 5), 1)
cv2.imshow('aussian', aussian)
cv2.waitKey(0)
cv2.destroyAllWindows()
# 中值滤波(一般中值滤波主要去除椒噪声和斑点噪声)
# 排序后拿中值替代中间元素值的大小
median = cv2.medianBlur(img, 5)  # 即内核指定为5*5
cv2.imshow('median', median)
cv2.waitKey(0)
cv2.destroyAllWindows()
# 展示所有的
res = np.hstack((blur, aussian, median))  # 矩阵横着拼接
# res = np.vstack((blur,aussian,median)) # 矩阵竖着拼接
print(res)
cv2.imshow('median vs average', res)
cv2.waitKey(0)
cv2.destroyAllWindows()

# 腐蚀操作
# 腐蚀操作通常是拿二值图像做腐蚀操作
# 腐蚀和膨胀的操作都不可逆,会导致图片丢失像素点信息
img = cv2.imread('material/imgExample.png')
cv2.imshow('img', img)
cv2.waitKey(0)
cv2.destroyAllWindows()
# 只要框里有黑色,中心点的值就变为黑色,即原来的白色被黑色腐蚀掉
kernel = np.ones((5, 5), np.uint8)
erosion = cv2.erode(img, kernel, iterations=1)  # kernel为核,iterations=1 指定迭代次数为1

cv2.imshow('erosion', erosion)
cv2.waitKey(0)
cv2.destroyAllWindows()

# 圆形腐蚀(例)
pie = cv2.imread('material/06_pie.png')
cv2.imshow('pie', pie)
cv2.waitKey(0)
cv2.destroyAllWindows()

kernel = np.ones((30, 30), np.uint8)
erosion_1 = cv2.erode(pie, kernel, iterations=1)
erosion_2 = cv2.erode(pie, kernel, iterations=2)
erosion_3 = cv2.erode(pie, kernel, iterations=3)
res = np.hstack((erosion_1, erosion_2, erosion_3))
cv2.imshow('res', res)  # 因为腐蚀的判定是方的,一个正方形的刮刀绕着一个圆滚一圈,剩下的图形就是这个样子
cv2.waitKey(0)
cv2.destroyAllWindows()

# 膨胀操作
# 腐蚀和膨胀的操作都不可逆,会导致图片丢失像素点信息
img = cv2.imread('material/imgExample.png')
cv2.imshow('img', img)
cv2.waitKey(0)
cv2.destroyAllWindows()
# 先腐蚀 后膨胀,抵消腐蚀造成的损害
kernel = np.ones((3, 3), np.uint8)
dige_erosion = cv2.erode(img, kernel, iterations=1)  # kernel核矩阵越小,越近园
cv2.imshow('erosion', dige_erosion)
cv2.waitKey(0)
cv2.destroyAllWindows()

kernel = np.ones((3, 3), np.uint8)
dige_dilate = cv2.dilate(dige_erosion, kernel, iterations=1)
cv2.imshow('dilate', dige_dilate)
cv2.waitKey(0)
cv2.destroyAllWindows()

# 圆形膨胀
pie = cv2.imread('material/06_pie.png')

kernel = np.ones((30, 30), np.uint8)
dilate_1 = cv2.dilate(pie, kernel, iterations=1)
dilate_2 = cv2.dilate(pie, kernel, iterations=2)
dilate_3 = cv2.dilate(pie, kernel, iterations=3)
res = np.hstack((dilate_1, dilate_2, dilate_3))
cv2.imshow('res', res)
cv2.waitKey(0)
cv2.destroyAllWindows()

# 开运算与闭运算
# 开：先腐蚀，再膨胀
print('[info]开运算')
img = cv2.imread('material/imgExample.png')

kernel = np.ones((5, 5), np.uint8)
opening = cv2.morphologyEx(img, cv2.MORPH_OPEN, kernel)

cv2.imshow('opening', opening)
cv2.waitKey(0)
cv2.destroyAllWindows()

# 闭：先膨胀，再腐蚀
print('[info]闭运算')
img = cv2.imread('material/imgExample.png')

kernel = np.ones((5, 5), np.uint8)
closing = cv2.morphologyEx(img, cv2.MORPH_CLOSE, kernel)

cv2.imshow('closing', closing)
cv2.waitKey(0)
cv2.destroyAllWindows()

# 梯度运算
# 梯度 = 腐蚀-膨胀
print('[info]梯度运算')
pie = cv2.imread('material/06_pie.png')

kernel = np.ones((7, 7), np.uint8)
dilate = cv2.dilate(pie, kernel, iterations=5)  # iterations=5 表示进行5次腐蚀
erosion = cv2.erode(pie, kernel, iterations=5)  # iterations=5 表示进行5次膨胀

res = np.hstack((dilate, erosion))

cv2.imshow('res', res)
cv2.waitKey(0)
cv2.destroyAllWindows()
gradient = cv2.morphologyEx(pie, cv2.MORPH_GRADIENT, kernel)  # MORPH_GRADIENT 梯度运算
cv2.imshow('gradient', gradient)
cv2.waitKey(0)
cv2.destroyAllWindows()

# 礼帽与黑帽
# 礼帽 = 原始输入-开运算
# 原始带刺，开运算不带刺，原始输入-开运算 = 刺
img = cv2.imread('material/imgExample.png')
kernel = np.ones((5, 5), np.uint8)
tophat = cv2.morphologyEx(img, cv2.MORPH_TOPHAT, kernel)
cv2.imshow('tophat', tophat)
cv2.waitKey(0)
cv2.destroyAllWindows()

# 黑帽 = 闭运算-原始输入
# 原始带刺，闭运算带刺并且比原始边界胖一点，闭运算-原始输入 = 原始整体
# 黑帽相当于突出显示之前用closing填坑用的地方 opening用来去毛刺，closing用来填坑，都是平滑边缘的方法
img = img = cv2.imread('material/imgExample.png')
kernel = np.ones((5, 5), np.uint8)
blackhat = cv2.morphologyEx(img, cv2.MORPH_BLACKHAT, kernel)
cv2.imshow('blackhat', blackhat)
cv2.waitKey(0)
cv2.destroyAllWindows()


# Sobel算子
'''
① Sobel算子函数：cv2.Sobel(src, ddepth, dx, dy, ksize)，返回值为Sobel算子处理后的图像。
ddepth：图像的深度
dx 和 dy 分别表示水平和竖直方向
ksize 是 Sobel 算子的大小
② 靠近最近点的左右和上下的权重最高，所以为±2。
    img:material/001_pie.png
'''
pie = cv2.imread('material/06_pie.png')  # 读取图像
cv2.imshow('img', pie)
cv2.waitKey()
cv2.destroyAllWindows()
'''
dst = cv2.Sobel(src,ddepth,dx,dy,ksize)  # ddepth 通常指定为-1
ddepth:图像的深度
dx和dy分别表示水平和竖直方向
ksize是Sobel算子的大小,即核的大小,一般是3*3或5*5
'''
# 梯度就是边界点，左边右边不一样
def cv_show(img, name):
    cv2.imshow(name, img)
    cv2.waitKey()
    cv2.destroyAllWindows()


# 白到黑是整数，黑到白是负数了，所有的负数会被截断成 0，所以要取绝对值
sobelx = cv2.Sobel(pie, cv2.CV_64F, 1, 0, ksize=3)  # 1,0 表示只算水平方向梯度
cv_show(sobelx, 'sobelx')
sobelx = cv2.Sobel(pie, cv2.CV_64F, 1, 0, ksize=3)
sobelx = cv2.convertScaleAbs(sobelx)  # 取负数时，取绝对值
cv_show(sobelx, 'sobelx')

sobely = cv2.Sobel(pie, cv2.CV_64F, 0, 1, ksize=3)  # 1,0 只算 y 方向梯度
sobely = cv2.convertScaleAbs(sobely)  # 取负数时，取绝对值
cv_show(sobely, 'sobely')
# 计算 x 和 y 后，再求和
sobelxy = cv2.addWeighted(sobelx, 0.5, sobely, 0.5, 0)  # 0是偏置项
cv_show(sobelxy, 'sobelxy')
# 不建议直接计算,还有重影
sobelxy = cv2.Sobel(pie, cv2.CV_64F, 1, 1, ksize=3)
sobelxy = cv2.convertScaleAbs(sobelxy)
cv_show(sobelxy, 'sobelxy')