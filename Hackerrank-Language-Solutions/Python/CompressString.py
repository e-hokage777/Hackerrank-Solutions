from itertools import groupby

string = input("Enter String: ")

group_iterator = groupby(string)

for key, group in group_iterator:
	print((len(list(group)), int(key)), end=' ')