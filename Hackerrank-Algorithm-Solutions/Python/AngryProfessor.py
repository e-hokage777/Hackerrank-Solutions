def angryProfessor(threshold, arrivalTimes):
	return "NO" if len(list(filter(lambda x : x <= 0, arrivalTimes))) >= threshold else "YES";

if __name__ == "__main__":
	test_cases = int(input("Number of test cases: "))

	for i in range(test_cases):
		num_of_students, threshold = map(int, input("Number of studends and threshold: ").split())

		arrivalTimes = list(map(int, input("Arrival Times: ").split()))

		print(angryProfessor(threshold, arrivalTimes));