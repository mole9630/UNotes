import shutil
import os

# 复制文件
shutil.copyfile("material/imgExample.png", "img2.png")

# 新建目录
path = "F:\Jetbrains\PycharmProjects\pythonProject\IASDBR\Test"  # 用来放置文件路径的变量
os.makedirs(path)  # 执行新建目录操作
# 复制文件到指定目录
shutil.copy("img2.png", path)  # 复制img2.png到path路径下

# 删除目录
shutil.rmtree(path)  # 删除path路径下的目录

# 复制目录
dst_path = "F:\Jetbrains\PycharmProjects\pythonProject\IASDBR\Test"
shutil.copytree(path,dst_path)