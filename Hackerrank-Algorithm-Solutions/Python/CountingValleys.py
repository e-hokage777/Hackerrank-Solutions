def countingValleys(steps, path):
	numValleys = 0
	pos = 0
	inValley = False;
	for i in path:
		if i == 'U':
			pos+=1
		else:
			pos-=1

		if pos >= 0:
			inValley = False
		else:
			if inValley:continue
			inValley = True
			numValleys+=1
	return numValleys




steps = int(input("Enter number of steps: "))
path = input("Enter path taken: ")


print(countingValleys(steps, path))

