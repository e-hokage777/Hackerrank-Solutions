def pickingNumbers(array):
	array = sorted(array)
	start = array[0]
	count = 0
	max_len = 0

	for i in array:
		if abs(start - i) <= 1:
			count+=1
			if count > max_len:
				max_len = count
		else:
			if count > max_len:
				max_len = count
			start = i
			count = 1

	return max_len

if __name__ == "__main__":
	number_of_ints = int(input("Number of integers: "))
	array = list(map(int, input("Elements: ").split()))
	print(pickingNumbers(array))