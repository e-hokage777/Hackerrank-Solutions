from itertools import combinations_with_replacement

string, group_size = input("String and group size: ").split()

for combination in combinations_with_replacment(sorted(string), int(group_size)):
	print(''.join(combination))