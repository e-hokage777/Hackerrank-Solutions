def mutateString(string, index, character):
	stringList = list(string)
	stringList[index] = character
	return ''.join(stringList)
	#I could have also used string splitting for this method

string = input('String: ')
index,character = input('Index and replacement: ').split()
newString = mutateString(string,int(index),character)
print(newString)