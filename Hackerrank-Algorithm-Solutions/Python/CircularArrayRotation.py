from collections import deque

def circularArrayRotation(array, num_of_rotations, queries):
	array.rotate(num_of_rotations)

	for i in queries:
		yield array[i]

if __name__ == "__main__":
	num_of_elements = int(input("Number of elements: "))
	num_of_rotations = int(input("Number of rotations: "))
	num_of_queries = int(input("Number of queries: "))

	array = deque(map(int, input("Array elements: ").split()))
	queries = [];

	for i in range(num_of_queries):
		queries.append(int(input("Query index: ")))

	print(list(circularArrayRotation(array, num_of_rotations, queries)))
