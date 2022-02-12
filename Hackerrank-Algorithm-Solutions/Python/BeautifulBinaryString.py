def beautfulBinaryString(b):
	size = len(b)
	b = list(b)
	steps = 0

	if size < 3:
		return steps


	for i in range(size-2):
		if b[i] == "0" and b[i+1] == "1" and b[i+2] == "0":
			steps += 1
			b[i+2] = "1"


	return steps



print(beautfulBinaryString("0111011101110111"))