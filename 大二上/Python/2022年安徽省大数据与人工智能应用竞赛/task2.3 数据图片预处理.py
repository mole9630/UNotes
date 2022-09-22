import cv2
import os

i = 0
list_img = []
resize_img = [1 for n in range(1, 6)]


def read_directory(directory_name):
    for filename in os.listdir(r"./" + directory_name):
        img = cv2.imread(directory_name + "/" + filename)
        list_img.append(img)


read_directory('material/task2_3/')
while i < 5:
    resize_img[i] = cv2.resize(list_img[i], (128, 128))
    resize_img[i] = cv2.blur(resize_img[i], (5, 5))
    cv2.imshow('img_show', resize_img[i])
    cv2.waitKey(0)
    cv2.destroyAllWindows()
    i += 1
