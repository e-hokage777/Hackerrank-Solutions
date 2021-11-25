from collections import defaultdict

group_A_size, group_B_size = map(int, input("Group A size and Group B size: ").split())

group_A = input("Group A elements: ").split()
group_B = input("Group B elements: ").split()

indicies = defaultdict(list)


for i in range(group_A_size):
	indicies[group_A[i]].append(i+1)

for i in group_B:
	group = indicies[i]
	
	if len(group) > 0:
		print(*group)
	else:
		print(-1)