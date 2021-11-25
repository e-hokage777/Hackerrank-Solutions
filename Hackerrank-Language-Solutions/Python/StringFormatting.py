n = int(input('Value to operate on: '))
pad = len('{:b}'.format(n))
for m in range(n):
	print('{0:{l}d} {0:{l}o} {0:{l}X} {0:{l}b}'.format(m+1,l=pad))
