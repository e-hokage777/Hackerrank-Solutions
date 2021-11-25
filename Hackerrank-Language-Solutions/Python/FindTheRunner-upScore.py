n = int(input("Number of integers: "))
arr = map(int, input().split())

myList = list(arr)
myList = sorted(myList)

count = len(myList)

while count>0:
	count = count-1
	if myList[count] == max(myList):
		continue
	else:
		print(myList[count])
		break;