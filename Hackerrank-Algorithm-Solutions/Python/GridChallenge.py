def gridChallenge(grid):
	rows = len(grid)
	columns = len(grid[0])
	for i in range(rows):
		grid[i] = sorted(grid[i])

	## moving through to check if columns sorted
	for i in range(columns):
		for j in range(rows-1):
			if grid[j][i] > grid[j+1][i]:
				return "NO"


	return "YES"



print(gridChallenge(['ebacd', 'fghij', 'olmkn', 'trpqs', 'xywuv']))
