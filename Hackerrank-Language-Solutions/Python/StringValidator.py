'''
Some string methods
str.islower() - checks if lower case
str.isupper() - checks if upper
str.isdigit() - checks if only digits
str.isalpha() - checks if onlly alphabets
str.isalnum() - checks if alphanumeric
'''

s = input('A string: ')
check = False
#Checking if contains alphanum
for m in s:
	if m.isalnum():
		check = True
		break;
print(check)
check = False
#for alphabets
for m in s:
	if m.isalpha():
		check = True
		break;
print(check)
check = False
#for digits
for m in s:
	if m.isdigit():
		check = True
		break;
print(check)
#for lower
for m in s:
	if m.isalpha() and m.islower():
		check = True
		break;
print(check)
check = False
#for upper
for m in s:
	if m.isupper():
		check = True
		break;
print(check)