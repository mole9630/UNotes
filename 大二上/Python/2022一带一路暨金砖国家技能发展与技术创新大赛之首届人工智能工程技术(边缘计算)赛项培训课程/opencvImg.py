import cv2 as cv

src = cv.imread("material/imgExample.png") #括号里是照片地址
cv.namedWindow("input image", cv.WINDOW_AUTOSIZE)
cv.imshow("input image", src)
cv.waitKey(0)
cv.destroyAllWindows()
print("end")