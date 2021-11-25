from collections import namedtuple
import functools;

number_of_students = int(input("Number of students: "))

columns = input("Column Names").split()

Student = namedtuple("Student",columns)

print(functools.reduce(lambda x, y : y + x, [int(student.MARKS) for student in [Student(*input("Values: ").split()) for i in range(number_of_students)]])/number_of_students)