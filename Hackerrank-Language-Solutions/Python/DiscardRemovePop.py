n = int(input("Number of elements: "))
s = set(map(int, input("Elements: ").split()))
numO = int(input("Number of operations: "))

for i in range(numO):
	op_and_num = input("Enter operation and number: ").split()
	op = op_and_num[0]

	if len(op_and_num) > 1:
		num = int(op_and_num[1])

	if op == "discard":
		s.discard(num)
	elif op == "remove":
		s.remove(num)
	else:
		s.pop()


print(sum(s))