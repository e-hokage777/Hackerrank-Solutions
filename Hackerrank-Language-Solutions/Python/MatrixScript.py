import re

###Getting number of rows and columns

rows, columns = map(int, input('Rows and Colums: ').split())

matrix = []

###Getting the matrix elements

for i in range(rows):
	matrix_item = input("Matrix item: ")
	matrix.append(matrix_item)


shift = 0
first_result = ''

###Converting the matrix elements into a single string

while shift < columns:
	for matrix_item in matrix:
		first_result+=matrix_item[shift]

	shift+=1

###Replacing the symbols and whitespaces between
###alphanumeric characters with a single whitespace

final_result = re.sub(r'(?<=\w)\W+(?=\w)', ' ', first_result)
print(final_result)