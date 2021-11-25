def kaprekarNumbers(start, end):
	result = []
	kapreka_numbers = [1,9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050, 7272, 7777, 9999, 17344, 22222, 77778, 82656, 95121, 99999]

	for i in kapreka_numbers:
		if start<=i<=end:
			result.append(i)

	print("INVALID RANGE" if len(result) < 1 else result)

if __name__ == "__main__":
	start, end = map(int, input("Start and End: ").split())
	kaprekarNumbers(start, end)


##code for generating the modified kaprekar numbers
	# for i in range(start, end+5):
	#   if i == 1 || i == 0:
	#		result.append(i)
	#		continue
	#	if i < 9:
	#		continue
	# 	original = i
	# 	original_string = str(i)
	# 	len_of_original = len(original_string)
	# 	original_square_str = str(i**2)
	# 	len_of_sq_original = len(original_square_str)

	# 	if int(original_square_str[-len_of_original:]) + int(original_square_str[0:-len_of_original]) == original:
	# 		result.append(original)