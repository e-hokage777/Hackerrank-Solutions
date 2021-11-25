import re

# s = 'BANANA'

# res = []
# res2 = []
# counter = 0
# counter2 = 0

# for i in s:
# 	if re.match(r'[^AEIOU]',i):
# 		res.append(s[counter:len(s)])
# 	else:
# 		res2.append(s[counter:len(s)])

# 	counter+=1

# print(len(''.join(res)))
# print(len(''.join(res2)))


def minion_game(string):
	# your code goes here
	consonants = []
	vowels = []
	counter = 0

	s = string

	for i in s:
		if re.match(r'[^AEIOU]',i):
			consonants.append(s[counter:len(s)])
		else:
			vowels.append(s[counter:len(s)])

		counter+=1
        
	Stuart = len(''.join(consonants))
	Kevin = len(''.join(vowels))
    
	if(Stuart > Kevin):
		print('Stuart',Stuart)
	elif(Kevin > Stuart):
		print('Kevin',Kevin)
	else:
		print('Draw')

	print(counter)


minion_game('')