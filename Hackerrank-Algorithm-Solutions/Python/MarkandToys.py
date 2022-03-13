def maximumToys(prices, k):
	prices.sort()

	total = 0

	for price in prices:
		k-=price

		if k < 0:
			break

		total += 1


	return total


print(maximumToys([51,70],50))
