sizeA = int(input("Size of main set: "))
A = set(map(int, input("Enter main set elements: ").split()))

N = int(input("Number of sets to operate on: "))

for i in range(N):
	operation, size = input("Operation and size of second set: ").split()
	B = set(map(int, input("Set B elements: ").split()))

	if operation == "intersection_update":
		A.intersection_update(B)

	if operation == "update":
		A.update(B)

	if operation == "symmetric_difference_update":
		A.symmetric_difference_update(B)

	if operation == "difference_update":
		A.difference_update(B);

print(sum(A))