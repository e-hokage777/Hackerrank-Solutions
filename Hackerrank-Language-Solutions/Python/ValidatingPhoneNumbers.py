import re

num = int(input('Number of phone numbers to test => '))

regex = r'^[789]\d{9}$'

for i in range(num):
	print("YES" if re.match(regex, input("Phone Number: ")) != None else "NO")