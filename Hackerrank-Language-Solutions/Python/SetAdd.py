number_of_stamps = int(input("Number of stamps: "))
stamps = set()

for i in range(number_of_stamps):
	stamps.add(input("Country of stamp:"))

print(len(stamps))