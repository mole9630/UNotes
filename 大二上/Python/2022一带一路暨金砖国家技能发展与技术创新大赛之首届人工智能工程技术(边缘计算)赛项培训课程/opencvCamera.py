import cv2

# 使用摄像头获取

cap = cv2.VideoCapture(0)
print(cap.isOpened())
while True:
    success, camera = cap.read()
    if success:
        cv2.imshow("cameraTest", camera)

        # 按下q关闭窗口,30ms自动切换下一帧
        if cv2.waitKey(30) == ord("q"):
            cv2.destroyAllWindows()
            print("end")
            break
