def minimumAbsoluteDifference(arr):
	arr.sort()
	size = len(arr)
	min_diff = 10**10

	for i in range(size-1):
		diff = abs(arr[i] - arr[i+1])
		if diff < min_diff:
			min_diff = diff

	return min_diff