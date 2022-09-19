import torch
import sys
import sklearn
import cv2
print('Python version Info: ' + sys.version)
print('PyTorch version Info: ' + torch.__version__ )
print('OpenCV version Info: ' + cv2.__version__)
# print("Sklearn verion Info { } ".format(sklearn.__version__))
x1 = torch.zeros(2, 3)
print("x1 :",x1)
y1 = torch.ones(2, 3)
print("y1 : ",y1)
print("x1 + y1 :", x1 + y1)
