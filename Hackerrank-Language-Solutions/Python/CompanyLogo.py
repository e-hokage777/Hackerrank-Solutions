from collections import Counter

s = input("Enter String: ")
counts = Counter(s)
num = 3

for letter in sorted(counts, key = lambda x : (1/counts[x], x)):
	if num > 0:
		print(letter, counts[letter])
		num-=1
