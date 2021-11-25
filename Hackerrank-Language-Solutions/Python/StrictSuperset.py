A = set(map(int, input("Set A elements: ").split()))

n = int(input("Number of test sets"))

check = True

for i in range(n):
	B = set(map(int, input("Set B elements: ").split()))
	if(A.issuperset(B) and len(A) > len(B)):
		check = True
	else:
		check = False
		break
print(check)