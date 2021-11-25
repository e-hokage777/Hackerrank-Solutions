num_of_students, num_of_subjects = map(int, input("Number of studends and number of subjects: ").split())

averages = [sum(x)/num_of_subjects for x in zip(*[list(map(float, input("Scores: ").split())) for i in range(num_of_subjects)])]

for average in averages:
	print(average)