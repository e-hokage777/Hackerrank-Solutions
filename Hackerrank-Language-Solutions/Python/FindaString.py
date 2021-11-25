string = input('String: ')
substring = input('Substring: ')
counts = 0
ind = 0
for n in range(len(string)):
	ind = string.find(substring,ind)
	if ind != -1:
		counts+=1
		ind +=1

print(counts)