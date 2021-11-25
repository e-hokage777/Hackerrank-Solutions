def absolutePermutation(n,k):

	if n % 2 == 1 and k!=0 :
		return -1

	original = [i for i in range(1,n+1)]
	absolute_permutation = []
	

	if k == 0:
		return original

	for index in original:
		if index <= k:
			candidate = index + k
			if candidate > n:
				return -1
			else:
				absolute_permutation.append(candidate)


		if index > k:
			candidate1 = index-k
			candidate2 = index+k
			if absolute_permutation[candidate1-1] == index:
				absolute_permutation.append(candidate1)
				continue

			if candidate2 > n:
				return -1
			else:
				absolute_permutation.append(candidate2)

	return absolute_permutation



if __name__ == '__main__':
	num_of_tests = int(input("Number of test cases: "))

	for i in range(num_of_tests):
		n, k = map(int,input("Upper bound and k: ").split())

		result = absolutePermutation(n,k)

		print(result)
