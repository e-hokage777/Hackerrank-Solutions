def alternatingCharacters(s):
	current = s[0]
	deletions = 0

	for i in range(1,len(s)):
		if s[i] == current:
			deletions+=1
		else:
			current = s[i]

	return deletions


print(alternatingCharacters("ABABABBAB"))