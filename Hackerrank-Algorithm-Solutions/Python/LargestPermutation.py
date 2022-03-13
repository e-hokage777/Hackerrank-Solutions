def largestPermutation(k, arr):
	size = len(arr)
	lexi_arr = sorted(arr, reverse = True)

	indices = [0] * (size+1)

	## setting up the indices of the elements in the array
	for i in range(size):
		indices[arr[i]] = i

	for swap in range(size):
		temp = arr[swap]
		curr = lexi_arr[swap]

		if temp != curr:			
			arr[swap] = curr
			arr[indices[curr]] = temp
			indices[temp] = indices[curr]
			k-=1

		if k == 0:
			break

	return arr

print(largestPermutation(2,[5,3,1,2,4]))



