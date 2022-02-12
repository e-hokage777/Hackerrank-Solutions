from collections import Counter

def gemstones(arr):
	num_gemstones = 0

	for mineral in set(arr[0]):
		gem = False
		for i in range(0,len(arr)):
			if mineral in arr[i]:
				gem = True
				continue
			else:
				gem = False
				break

		if gem:
			num_gemstones+=1

	return num_gemstones





print(gemstones(["abcdde", "baccd", "eeabg"]))

