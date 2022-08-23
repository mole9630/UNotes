import cv2 as cv  # opencv读取的图像是BGR格式 cv2则是opencv的库
import matplotlib.pyplot as plt  # 绘图展示的库
import numpy as np  # 基本的数值计算数据包

# 数据读取-图像
'''
cv2.IMREAD_ COLOR:彩色图像
cv2.IMREAD_ GRAYSCALE:灰度图像
'''

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


# 数据读取-视频
'''
cv2.VideoCapture可以捕获摄像头,用数字来控制不同的设备,例如0,1
如果是视频文件,直接指定好路径即可
'''
vc = cv.VideoCapture("material/videoExample.mp4")  # 读取指定路径下的视频
if vc.isOpened():  # 检查是否打开正确
    oepn, frame = vc.read()  # open返回的为布尔类型 frame返回的为当前帧的图像
else:
    open = False
while open:
    ret, frame = vc.read()
    if frame is None:  # 若读到的不为空,则表示还没有读到视频的最后一帧,则继续执行
        break
    if ret == True:
        gray = cv.cvtColor(frame, cv.COLOR_BGR2GRAY)  # 把当前帧图像转换为灰度图
        cv.imshow("video_show", gray)
        if cv.waitKey(33) & 0xFF == 27:  # waitKey(33)表示33毫秒切换一帧 0xFF == 27表示按下esc键时退出
            break
vc.release()
cv.destroyAllWindows()
