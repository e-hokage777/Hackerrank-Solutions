import math

def encrypt(s):
	s = s.strip().replace(" ", "")
	print(s)

	length_of_string = len(s)

	floor_sqrt = int(math.sqrt(length_of_string))
	ceil_sqrt = math.ceil(math.sqrt(length_of_string))

	rows = floor_sqrt
	cols = ceil_sqrt

	#Making sure rows * columns > length_of_string
	if rows*cols < length_of_string:
		rows = rows+1


	word = ""
	result = ""
	index = 0

	#Creating the encrypted string
	for i in range(cols):
		index = i
		word = ""
		word += s[i]
		for j in range(rows-1):
			try:	
				index += cols
				word += s[index]
			except:
				break

		result += word+ " "

	return result



if __name__ == '__main__':
	string = input("Enter string to encrypt: ")
	result = encrypt(string)
	print(result)
