def split_and_join(s):
	s = s.split()
	return '-'.join(s)

string = input('Your String: ')

print(split_and_join(string))