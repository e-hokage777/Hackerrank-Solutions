from itertools import combinations

str_and_psize = input("String and combination size: ").split()

string = str_and_psize[0]
combination_size = int(str_and_psize[1])

for i in range(1,combination_size+1):
	for combination in combinations(sorted(string), i):
		print(''.join(combination))