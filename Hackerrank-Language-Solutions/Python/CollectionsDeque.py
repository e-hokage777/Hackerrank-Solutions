from collections import deque

d = deque();

number_of_operations = int(input("Number of operations: "))

for i in range(number_of_operations):
	operation = input("Operation: ")

	params = operation.split()

	if params[0] == 'append':
		d.append(params[1])

	if params[0] == 'appendleft':
		d.appendleft(params[1])

	if params[0] == 'pop' and len(d) > 0:
		d.pop()

	if params[0] == 'popleft' and len(d) > 0:
		d.popleft()

print(*d)

