import re

string = input("String: ")

regex = r'(?<=[qwrtypsdfghjklzxcvbnm])([aeiou]{2,})(?=[qwrtypsdfghjklzxcvbnm])'

matches = re.findall(regex, string, re.IGNORECASE)

if len(matches) < 1:
	print(-1)
else:
	for match in matches:
		print(match)


#matches = re.finditer(regex, string, re.IGNORECASE)
