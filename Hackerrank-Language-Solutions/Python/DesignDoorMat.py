n,m = list(map(int,input("Enter height and lenght: ").split()))

num_iters = n//2

mat_parts = []

for i in range(num_iters):
	mat_parts.append((((i*2)+1)*'.|.').center(m,'-'))

mat_parts.append('WELCOME'.center(m,'-'))

mat_parts+=(mat_parts[:-1][::-1])

print('\n'.join(mat_parts))
