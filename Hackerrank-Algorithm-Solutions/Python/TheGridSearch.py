def gridSearch(G, P, C, c, R, r):
	for row in range(R):
		p_col = 0
		p_row = 0

		if (R-row) < r:
			return "NO"

		for column in range(C):
			possibility = False
			if (C-column) < c:
				continue

			if G[row][column] == P[p_row][p_col]:
				if G[row][column:column+c] == P[p_row]:
					possibility = True

			if possibility:
				match_count = 1
				for _ in range(r-1):
					if(G[row+_+1][column:column+c] == P[p_row+_+1]):
						match_count+=1
				if match_count == r:
					return "YES"


	return "NO"


if __name__ == "__main__":
	t = int(input("Number of test cases: "))

	for i in range(t):
		G = []
		P = []

		R,C = map(int, input("Row and Column sizes of grid: ").split())

		print("Enter grid elements")

		for _ in range(R):
			G.append(input())


		r,c = map(int, input("Row and Column Sizes of pattern: ").split())

		print("Enter pattern elements")
		for _ in range(r):
			P.append(input())


		result =  gridSearch(G,P,C,c,R,r)
		print(result)