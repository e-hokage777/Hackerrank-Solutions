def marcsCakewalk(calorie):
	calorie.sort(reverse=True)
	dist = 0
	for i in range(len(calorie)):
		dist += 2**i * calorie[i]



	return dist


print(marcsCakewalk([7, 4, 9, 6]))
