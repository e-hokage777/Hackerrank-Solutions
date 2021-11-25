def rotate(arr, i, j, k):
	tempi = arr[i]
	tempj = arr[j]
	tempk = arr[k]

	arr[i] = tempj
	arr[j] = tempk
	arr[k] = tempi

def larrysArray(A):
	sorted_arr = sorted(A)
	answer = "NO"

	if A == sorted_arr:
		return answer

	if len(A) < 3:
		return answer

	start_index = 0
	cant_sort = False

	while A != sorted_arr:
		current_index = A.index(start_index+1)
		
		while current_index != start_index:
			if current_index == len(A)-1:
				index_num1 = current_index-2
				index_num2 = current_index-1
				rotate(A,index_num1,index_num2,current_index)

			else:
				index_num1 = current_index-1
				index_num2 = current_index+1
				rotate(A,index_num1, current_index, index_num2)

			current_index -= 1

		if (current_index > 0) and (A[current_index] - A[current_index - 1] != 1):
			cant_sort = True
			answer = "NO"
			break

		answer = "YES"

		start_index += 1

	return answer



test_cases = int(input("Number of test cases: "))

for i in range(test_cases):
	num_of_elements = int(input("Number of elements: "))
	A = list(map(int,input("Elements of array: ").split()))
	print(larrysArray(A))