import re

string = input("Enter string to test: ")

regex = r'([A-Za-z0-9])(?=\1+)'

match = re.search(regex, string)

print(-1 if match is None else match.group())