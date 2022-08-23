import cv2 as cv  # opencv读取的图像是BGR格式 cv2则是opencv的库
import matplotlib.pyplot as plt  # 绘图展示的库
import numpy as np  # 基本的数值计算数据包

img = cv.imread("material/imgExample.png")  # 读取指定路径下的图像
cv.imshow('image_show', img)  # 创建一个名为"image_show"的窗口,来展示img图片
cv.waitKey(0)  # 等待时间,毫秒级,0表示按任意键终止
cv.destroyAllWindows()


def cv_show(name, img):  # 可以定义一个绘图的函数
    cv.imshow('image_show', img)  # 创建一个名为"image_show"的窗口,来展示img图片
    cv.waitKey(0)  # 等待时间,毫秒级,0表示按任意键终止
    cv.destroyAllWindows()


img = cv.imread("material/imgExample.png", cv.IMREAD_GRAYSCALE)  # cv.IMREAD_GRAYSCALE表示灰度图像
cv_show("show", img)
# cv.imwrite("material/imgExample2.png", img)  # 将img图片保存到指定路径下
