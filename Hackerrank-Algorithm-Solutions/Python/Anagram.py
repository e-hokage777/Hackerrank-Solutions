from collections import Counter


def anagram(s):
	change_f = 0
	change_s = 0

	len_s = len(s)
	if(len_s % 2 != 0):
		return -1

	half_len = int(len_s/2)

	f = Counter(s[:half_len])
	s = Counter(s[half_len:])

	for letter in f:
		diff = f[letter] - s[letter]
		if diff > 0:
			change_f += diff

	for letter in s:
		diff = s[letter] - f[letter]
		if diff > 0:
			change_s += diff

	return min(change_f, change_s)



print(anagram("aaabbb"))
print(anagram("ab"))
print(anagram("abc"))
print(anagram("mnop"))
print(anagram("xyyx"))
print(anagram("xaxbbbxx"))
print(anagram("cdeabc"))

# l = Counter("thisisaword")

# print(l["f"])
