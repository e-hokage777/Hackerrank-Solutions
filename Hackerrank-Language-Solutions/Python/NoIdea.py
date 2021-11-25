n, m = tuple(map(int, input("Lengths of Array and sets: ").split()))
arr = list(map(int, input("Array Elements: ").split()))
A = list(map(int, input("Elements of set A").split()))
B = list(map(int, input("Elements of set B").split()))
happiness = 0

for i in arr:
	lenA = len(A)
	lenB = len(B)

	print(len(A), len(B))

	A.add(i)
	B.add(i)

	newLenA = len(A)
	newLenB = len(B)

	print(newLenA,newLenB)

	if(newLenA == lenA):
		happiness+=1
	else:
		A.discard(i)

	if(newLenB == lenB):
		happiness-=1
	else:
		B.discard(i)


print(happiness)
