x = int(input("x : "))
y = int(input("y : "))
z = int(input("z : "))
n = int(input("n : "))

print("This is where the magic begins")
mainList = list()

for f in range(x+1):
	for s in range(y+1):
		for t in range(z+1):
			subList = [f,s,t]
			#trying something out over here
			if f+s+t ==n:
				continue;
			else:
				mainList.append(subList)

print(mainList)
