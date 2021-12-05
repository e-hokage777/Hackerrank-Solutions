def fairRotations(loaves):
	total = sum(loaves)
	count = 0

	if total % 2 != 0:
		return "NO"

	for i in range(len(loaves)-1):
		if loaves[i] % 2 != 0:
			loaves[i] = loaves[i]+1
			loaves[i+1] = loaves[i+1] + 1
			count+=2

	return count


if __name__ == '__main__':
	n = int(input("Subject loaves: "))
	loaves = list(map(int, input("Loaves: ").split()))

	print(fairRotations(loaves))