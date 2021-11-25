if __name__ == "__main__":
	num_of_athletes, num_of_attributes = map(int, input("Number of athletes and number of attributes: ").split())

	athletes = []

	for _ in range(num_of_athletes):
		athletes.append(list(map(int, input("Athlete info: ").split())))


	sort_index = int(input("Enter Index as base for sort: "))

	for athlete in sorted(athletes, key=lambda x: x[sort_index]):
		print(*athlete)
