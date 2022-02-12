def hackerinastring(s):
	test = "hackerrank"
	current_index = 0
	current = test[0]
	final = ""

	for letter in s:
		if letter == current:
			final += letter
		else:
			continue

		current_index+=1

		if current_index > len(test)-1:
			break

		current = test[current_index]

	return "YES" if final == test else "NO"

print(hackerinastring("haaaackerrankk"))