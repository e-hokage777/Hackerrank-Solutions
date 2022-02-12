import numpy as np

def findMedian(arr):
	arr.sort()
	return arr[int(len(arr)/2)]


print(findMedian([0, 1, 2, 4, 6, 5, 3]))
