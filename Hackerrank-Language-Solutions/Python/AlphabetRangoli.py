def print_rangoli(size):
	letters = 'abcdefghijklmnopqrstuvwxyz'
	width = 4*size - 3
	fin = []

	for i in range(size):
		sect = '-'.join(letters[i:size])
		fin.append((sect[::-1]+sect[1:]).center(width,'-'))

	fin = fin[1:][::-1]+fin
	print('\n'.join(fin))


print_rangoli(10)





