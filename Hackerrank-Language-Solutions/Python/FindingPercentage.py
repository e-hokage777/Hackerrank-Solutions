# n = int(input("No of Students: "))
# record = dict()

# for m in range(n):
# 	details = input("Enter name and marks of students: ").split()
# 	marks = list()
# 	for det in details:
# 		if details.index(det) == 0:
# 			name = det
# 		else:
# 			m = int(det)
# 			marks.append(det)
# 	record[name] = marks


# query = input("Student: ")

# for m in details:
# 	if m == query:
# 		studMarks = record[m]
# total = 0

# for num in studMarks:
# 	total+= int(num)

# average = total/len(studMarks)

# final = '{:.2f}'

# print(final.format(average))


##Different method
studrec = {}
n = int(input("How many students: "))

for m in range(n):
	name, *line = input().split()
	scores = list(map(float, line))
	studrec[name] = scores

query_name = input("Name: ")

total = 0

for num in studrec[query_name]:
	total+=num

avg = total/len(studrec[query_name])

final = '{:.2f}'

print(float(final.format(avg), ':.2f'))