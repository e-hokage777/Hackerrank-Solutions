def serviceLane(n, cases):
	return [min(widths[case[0]:case[1]+1]) for case in cases]


if __name__ == '__main__':
	width_arr_size, case_size = map(int, input("Size of width array and number of cases: ").split())
	widths = list(map(int, input("Widths: ").split()))

	cases = []
	for i in range(case_size):
		cases.append(list(map(int, input("Case: ").split())))

	print(serviceLane(width_arr_size,cases))
