from itertools import combinations

def check(s):
	works = True

	if(len(s) < 2):
		return 0

	first_char = s[0]
	second_char = s[1]

	if(first_char == second_char):
		return 0

	for i in range(0,len(s),2):
		if i == len(s)-1 and s[i] != s[i-1]:
			works = True
			break

		if(s[i] == first_char and s[i+1] == second_char):
			works = True
			if s[i+1] == len(s)-1:
				break
		else:
			works = False
			break

	if(works):
		return len(s)
	else:
		return 0

def trim(s, letters):

	for letter in letters:
		s = s.replace(letter, "")

	return check(s)



def alternate(s):
	s_letters = set(s)
	if(len(s_letters) == 1):
		return 0
	if(len(s_letters) == 2 and check(s)):
		return len(s)

	combs = combinations(s_letters,len(s_letters)-2)
	max_len = 0

	for comb in combs:
		res = trim(s,comb)
		max_len = res if res > max_len else max_len

	return max_len



print(alternate("aaaaaa"))
