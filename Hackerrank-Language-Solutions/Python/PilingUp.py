from collections import deque

def pileUp(cubes, num_of_cubes):
	last_index = num_of_cubes-1
	first_index = 0
	current_top = 2**32

	while len(cubes) > 0:
		if cubes[first_index] > cubes[last_index]:
			candidate = cubes[first_index]
			front = True
		else:
			candidate = cubes[last_index]
			front = False

		last_index -= 1

		if candidate > current_top:
			return "no"

		if front:
			current_top = cubes.popleft()
		else:
			current_top = cubes.pop()

	return "yes"


if __name__ == '__main__':
	number_of_cases = int(input("Number of test cases: "))

	for i in range(number_of_cases):
		num_of_cubes = int(input("Number of cubes: "))
		cubes = deque(map(int, input("Cubes(using side lengths): ").split()))

		print(pileUp(cubes, num_of_cubes))
