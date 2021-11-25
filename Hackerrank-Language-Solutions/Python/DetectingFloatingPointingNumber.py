import re

pattern = re.compile(r'^[+-]?((\.\d+)|(\d+\.\d+))$')

number_of_cases = int(input("Number of Test cases: "))

for i in range(number_of_cases):
	result_of_test = pattern.search(input("Number: "))

	print(result_of_test is not None)