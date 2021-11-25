def average(array):
	trees = set(array)
	return '{0:.3f}'.format(sum(trees)/len(trees))


if __name__ == '__main__':
	size = int(input("Number of trees: "))
	trees = list(map(int, input("Heights of trees: ").split()))
	result = average(trees)
	print(result)