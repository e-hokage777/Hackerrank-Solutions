def luckBalance(k, contests):
	unimportant = []
	important = []
	luck = 0

	for contest in contests:
		if contest[1] == 1:
			important.append(contest[0])

		if contest[1] == 0:
			unimportant.append(contest[0])



	luck += sum(unimportant)

	important.sort(reverse = True)
	size_impt = len(important)

	for l in range(size_impt):
		if l+1 <= k:
			luck += important[l]

		else:
			luck -= important[l]


	return luck


print(luckBalance(3,[[5, 1], [2, 1], [1, 1], [8, 1], [10, 0], [5, 0]]))

