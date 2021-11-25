from itertools import permutations

str_and_psize = input("String and permutation size: ").split()

string = str_and_psize[0]
permutation_size = int(str_and_psize[1])

for permutation in sorted(permutations(string, permutation_size)):
	print(''.join(permutation))

