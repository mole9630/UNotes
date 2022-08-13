import cv2

cap = cv2.VideoCapture("material/videoExample.mp4")
total_frame = cap.get(cv2.CAP_PROP_FRAME_COUNT)  # 获取总帧数
print("该视频总帧数为：", total_frame, "帧")
frame_num = 0
while True and frame_num < total_frame:
    success, frame = cap.read()  # 读取图像帧
    if success == True:
        frame_num += 1

        cv2.imshow("videoTest", frame)

        # 按下q关闭窗口,30ms自动切换下一帧
        if cv2.waitKey(30) == ord("q"):
            cv2.destroyAllWindows()
            break
