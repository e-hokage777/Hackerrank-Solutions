import re 

string = input("Enter your string here: ")

lower = []
upper = []
digits = []

for char in string:
	if re.match(r"\d", char):
		digits.append(char)
	elif re.match(r"[A-Z]", char):
		upper.append(char)
	else:
		lower.append(char)


#sorting the individual parts
lower = sorted(lower)
upper = sorted(upper)
digits = sorted(sorted(digits), key = lambda x : int(x) %2 == 0)

print("".join(lower+upper+digits))