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

# 截图图片的部分图像数据
img = cv.imread("material/imgExample.png")  # 读取指定路径下的图像
intercept = img[0:50, 0:200]  # 指定一个切片 高50 宽200
cv_show("intercept", intercept)

# 颜色通道提取
img = cv.imread("material/imgExample.png")  # 读取指定路径下的图像
b, g, r = cv.split(img)
img = cv.merge((b, g, r))
print(img.shape)  # (256, 256, 3)

# 只保留R
cur_img = img.copy()
cur_img[:, :, 0] = 0  # [第几行:第几行, 第几列:第几列 ,通道]
cur_img[:, :, 1] = 0
cv_show(' R', cur_img)

# 只保留G
cur_img = img.copy()
cur_img[:, :, 0] = 0
cur_img[:, :, 2] = 0
cv_show(' G', cur_img)

# 只保留B
cur_img = img.copy()
cur_img[:, :, 1] = 0
cur_img[:, :, 2] = 0
cv_show(' B', cur_img)

# 边界填充
'''
1.边界填充就是对图像进行一些变换，让原始图像进行扩大。
2.边界填充的入口参数:
    BORDER_REPLICATE:复制法，也就是复制最边缘像素。
    BORDER_REFLECT:反射法，对感兴趣的图像中的像素在两边进行复制例如:fedcba|abcdefgh|hgfedcb
    BORDER_REFLECT_101:反射法，也就是以最边缘像素为轴，对称，gfedcb|abcdefgh|gfedcba
    BORDER_WRAP:外包装法cdefgh|abcdefgh|abcdefg
    BORDER_CONSTANT:常量法，常数值填充。
'''
top_size, bottom_size, left_size, right_size = (50, 50, 50, 50)  # 填充多少区域

# 最后一个入口参数为填充方式
replicate = cv.copyMakeBorder(img, top_size, bottom_size, left_size, right_size,
                              borderType=cv.BORDER_REPLICATE)  # 方式一:复制法
reflect = cv.copyMakeBorder(img, top_size, bottom_size, left_size, right_size, cv.BORDER_REFLECT)  # 方式二:反射法
reflect101 = cv.copyMakeBorder(img, top_size, bottom_size, left_size, right_size,
                               cv.BORDER_REFLECT_101)  # 方式三:反射法二(不要最边缘的像素)
wrap = cv.copyMakeBorder(img, top_size, bottom_size, left_size, right_size, borderType=cv.BORDER_WRAP)  # 方式四:外包装法
constant = cv.copyMakeBorder(img, top_size, bottom_size, left_size, right_size, cv.BORDER_CONSTANT, value=0)  # 方式五:常量法

plt.subplot(231), plt.imshow(img, 'gray'), plt.title('ORIGINAL')
plt.subplot(232), plt.imshow(replicate, 'gray'), plt.title('REPLICATE')
plt.subplot(233), plt.imshow(reflect, 'gray'), plt.title('REPLECT')
plt.subplot(234), plt.imshow(wrap, 'gray'), plt.title('REFLECT_101')
plt.subplot(235), plt.imshow(wrap, 'gray'), plt.title('WRAP')
plt.subplot(236), plt.imshow(constant, 'gray'), plt.title('CONSTAVI')
plt.show()

# 数值计算
img_logo = cv.imread("material/imgExample.png")  # 读取指定路径下的图像
img_logo2 = img_logo + 10  # 将 img_cat 矩阵中每一个值都加 10
print("img_logo[:5, :, 0]:", img_logo[:5, :, 0])
print("img_logo2[:5, :, 0]:", img_logo2[:5, :, 0])
print("(img_logo + img_logo2)[:5, :, 0]:", (img_logo + img_logo2)[:5, :, 0])  # 0-255 若相加越界,如 294 用 294%256 获得余数 38

# 图像融合
img = cv.imread("material/imgExample.png")  # 读取指定路径下的图像
img_reversal = cv.imread("material/reversalImgExample.png")  # 读取指定路径下的图像

print("img.shape", img.shape)
print("img_reversal.shape", img_reversal.shape)
# img + img_reversal  # 不同数据大小不能执行数值计算操作
img_reversal = cv.resize(img_reversal, (256, 256))
print("img.shape", img.shape)
print("(resize)img_reversal.shape:", img_reversal.shape)

res = cv.addWeighted(img, 0.4, img_reversal, 0.6, 0)  # img 的权重为 0.4，img_reversal 的权重为 0.6
plt.imshow(res)
