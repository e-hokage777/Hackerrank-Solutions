name = input("Full Name: ")

names = name.split(' ')
capitalized = list()

for name in names:
	name = name.capitalize()
	capitalized.append(name)

print(' '.join(capitalized))
