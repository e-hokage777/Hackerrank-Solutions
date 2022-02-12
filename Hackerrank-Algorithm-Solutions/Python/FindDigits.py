
def findDigits(n):
	num = int(n)
	count = 0

	for i in str(n):
		digit = int(i)
		if digit != 0 and num%digit == 0:
			count+=1

	return count


if __name__ == '__main__':
	num_of_tests = int(input("Number of test cases: "))

	for i in range(num_of_tests):
		print(findDigits(input("Number: ")))