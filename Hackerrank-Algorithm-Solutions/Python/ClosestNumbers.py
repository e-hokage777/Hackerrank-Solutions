def closestNumbers(arr):
	size = len(arr)
	arr.sort()
	result = []

	##Finding smallest difference
	smallest_diff = abs(arr[0]-arr[1])

	for i in range(0,size-1):
		if abs(arr[i]-arr[i+1]) < smallest_diff:
			smallest_diff = abs(arr[i]-arr[i+1])

	for i in range(0,size-1):
		if abs(arr[i] - arr[i+1]) == smallest_diff:
			result.append(arr[i])
			result.append(arr[i+1])


	return result


print(closestNumbers([-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854]))
