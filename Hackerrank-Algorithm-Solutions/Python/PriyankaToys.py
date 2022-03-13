def toys(w):
	w.sort()
	threshold = w[0] + 4
	count = 1
	for toy in w:
		if toy > threshold:
			threshold = toy + 4
			count+=1


	return count


print(toys([1,6,11]))
