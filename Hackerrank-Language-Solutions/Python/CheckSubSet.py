test_cases = int(input("Enter number of Test Cases: "))

for i in range (test_cases):
	num_A = int(input("Number of Elements in set A: "))
	A = set(map(int, input("Set A elements: ").split()))
	num_B = int(input("Number of Elements in set B: "))
	B = set(map(int, input("Set B elements: ").split()))

	print(A.issubset(B))