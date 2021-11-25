from collections import deque


def cutTheSticks(sticks):
	while(len(sticks) > 0):
		print(len(sticks))
		shortest = sticks[0]

		sticks = filter(lambda x : x != shortest, sticks)
		sticks = list(map(lambda x : x - shortest, sticks))


if __name__ == "__main__":
	num_of_sticks = int(input("Number of sticks: "))
	sticks = list(sorted((map(int, input("Sticks: ").split()))))

	cutTheSticks(sticks)