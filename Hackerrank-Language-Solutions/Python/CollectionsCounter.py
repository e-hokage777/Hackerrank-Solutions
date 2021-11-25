from collections import Counter

number_of_shoes = int(input("Number of shoes: "))

shoes = Counter(map(int, input("Shoes: ").split()))

number_of_customers = int(input("Number of customers: "))

total = 0

for i in range(number_of_customers):
	size, amount = map(int, input("Shoe and amount: ").split())

	if size in shoes and shoes[size] != 0:
		shoes[size]-=1
		total += amount


print(total)
