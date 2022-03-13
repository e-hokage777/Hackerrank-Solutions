def maximumPerimeterTriangle(sticks):
	sticks.sort(reverse = True)
	size = len(sticks)
	largest_perimeter = -1

	for i in range(size-2):
		largest = sticks[i]
		sum_smallest = sticks[i+1] + sticks[i+2]
		perimeter = largest + sum_smallest

		if largest < sum_smallest and perimeter > largest_perimeter:
			return sorted(sticks[i:i+3])



	return [largest_perimeter]


print(maximumPerimeterTriangle([1,2,3]))

