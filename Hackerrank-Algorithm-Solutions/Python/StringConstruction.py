def stringConstruction(s):
	cost = 0
	p = ""
	for letter in s:
		if letter not in p:
			cost += 1
			p+=letter


	return cost


print(stringConstruction("abcd"))