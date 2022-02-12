def bigSorting(unsorted):
	unsorted.sort(key=lambda x: int(x))
	return unsorted



print(bigSorting(['1','200','50','3']))