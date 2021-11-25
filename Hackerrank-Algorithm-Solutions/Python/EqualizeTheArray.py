from collections import Counter

def equalizeArray(array):
	return len(array)-max(Counter(array).values())


if __name__ == '__main__':
	size = int(input("Size of array: "))
	array = list(map(int, input("Elements: ").split()))

	print(equalizeArray(array))