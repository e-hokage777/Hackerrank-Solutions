def organinzingContainers(containers):
	#Getting the total number of each type of ball
	ball_types = {}

	for container in containers:
		for i in range(len(container)):
			ball_types[i] = ball_types.get(i,0)+container[i]

	print(ball_types)

	#Move through each of containers and check if there are enough swaps
	for container in containers:
		possible = False
		total_in_container = sum(container)
		for i in range(len(container)):
			swaps_needed = total_in_container - container[i]
			available = ball_types[i]-container[i]

			if available == swaps_needed:
				possible = True
				break

		if not possible:
			return "Impossible"


	return "Possible"


if __name__ == '__main__':
	test_cases = int(input("Number of test cases: "))

	for i in range(test_cases):
		num_of_containers = int(input("Number of containers: "))

		containers = []
		for j in range(num_of_containers):
			containers.append(list(map(int, input("Container elements: ").split())))
		
		result = organinzingContainers(containers)

		print(result)
