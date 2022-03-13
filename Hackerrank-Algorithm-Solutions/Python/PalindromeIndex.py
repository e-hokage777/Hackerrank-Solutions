from collections import Counter

def palindromeIndex(s):
	s_length = len(s)
	mid = int(s_length/2)
	index = -1

	for i in range(mid):
		if s[i] != s[s_length-i-1]:
			if s[i] == s[s_length-i-2]:
				index = s_length-i-1
			elif s[i+1] == s[s_length-i-1]:
				index = i



	return index


print(palindromeIndex("aabaabb"))