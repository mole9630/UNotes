import sys
from PyQt5 import QtWidgets
from PyQt5.QtGui import QPixmap, QImage
from PyQt5.QtWidgets import *
import cv2


class Qt_Window(QWidget):  # 定义一个类,继承于QWidget QWidget类是所有用户界面对象的基类
    def __init__(self):  # 构造方法
        self._app = QtWidgets.QApplication([])  # 创建QApplication实例
        super(Qt_Window, self).__init__()

    def init_ui(self):  # 定义方法,在该方法里构造界面组件
        self.win = QMainWindow()

        self.win.setWindowTitle("第一个主窗口")
        openAction = QAction('Open', self.win)

        exitAction = QAction('Exit', self.win)
        exitAction.setShortcut('Ctrl+Q')
        exitAction.triggered.connect(qApp.quit)

        self.toolbar = self.win.addToolBar('Open')
        self.toolbar.addAction(openAction)
        self.toolbar = self.win.addToolBar('Exit')
        self.toolbar.addAction(exitAction)

        # 添加按钮
        self.button = QPushButton(self.win)
        self.button.move(200, 300)  # 设置文本位置
        self.button.resize(200, 40)  # 设置控件宽高
        self.button.setText("这是一个按钮")  # 设置按钮缺省文本

        # 添加标签
        self.textlabel = QLabel(self.win)
        self.textlabel.move(200, 200)
        self.textlabel.resize(200, 40)
        self.textlabel.setText("这是一个标签")

        # 添加下拉框
        self.comboBox = QComboBox(self.win)
        self.comboBox.setGeometry(450, 300, 200, 40)  # 设置控件的x,y,宽,高 即结合move和resize方法
        self.comboBox.addItems(["选项1", "选项2", "选项3"])  # 给下拉框添加元素

        # 添加图片
        self.img = QLabel(self.win)
        self.img.setGeometry(700, 100, 400, 400)
        img = cv2.imread("material/imgExample.png")  # Ndarray格式
        # 将 Ndarray 格式转换为 Qpixmap 格式并显示
        qImg = self.NdarraytoQimage(img)  # 将 Ndarray 转换为 QImage 格式
        pix = QPixmap(qImg)  # 将 QImage 转换为 Qpixmap 格式
        self.img.setPixmap(pix)  # 将图像加载到QLabel控件上

        # pix = QPixmap ("material/imgExample.png")  # 读取该路径下的图片
        # self.img.setPixmap(pix)  # 将图像加载到QLabel控件上
        self.img.setScaledContents(True)  # 自适应QLabel的大小

        self.win.showFullScreen()  # 窗口全屏显示,不带标题栏和边框
        sys.exit(self._app.exec_())  # app.exec()的作用是运行主循环,开始进行事件处理,直到结束 sys.exit()退出程序机制

    # 将 Ndarray 转换为 QImage 格式加载图像并显示
    def NdarraytoQimage(self, img):
        """
        使用这个函数将Ndarray图像转换为Qimage图片
        参数:
            >> img: ndarray图片
        返回值:Qimage图像
        """
        im = cv2.cvtColor(img, cv2.COLOR_BGR2RGB)
        height, width, channel = img.shape
        # 第四个参数bytesPerLine表示图像每行有多少个字节,彩色图像(RGB),每个像素占用3个字节的空间
        qImg = QImage(im.data, width, height, channel * width, QImage.Format_RGB888)
        return qImg


class Dialog(QWidget):
    def __init__(self):
        self._app = QtWidgets.QApplication([])
        super(Dialog, self).__init__()

    def init_ui(self):
        self.win = QDialog()
        self.win.resize(1280, 720)
        self.win.setWindowTitle("对话窗口")

        self.win.show()
        sys.exit(self._app.exec_())


ui = Qt_Window()  # 调用对象
ui.init_ui()  # 调用方法
