students = list()
scores = list()
beforeLast = 0;

for n in range(int(input("Number of students: "))):
	name = input("Name: ")
	score = float(input("Score: "))
	student = [name, score]
	students.append(student)

for n,s in students:
	scores.append(s)

scores = sorted(scores)

for num in scores:
	if num > min(scores):
		beforeLast = num
		break

students = sorted(students)

for n,s in students:
	if s == beforeLast:
		print(n)

