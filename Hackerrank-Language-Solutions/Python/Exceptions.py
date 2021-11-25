cases = int(input("Number of cases: "))

for n in range(cases):
	args = input("values for a and b: ").split()
	try:
		a = int(args[0])
	except ValueError:
		print("Error Code: invalid literal for int() with base 10: "+"'"+args[0]+"'")
		continue
	try:
		b = int(args[1])
	except ValueError:
		print("Error Code: invalid literal for int() with base 10: "+"'"+args[1]+"'")
		continue
	try:
		print(int(a/b))
	except ZeroDivisionError:
		print('Error Code: integer divison or modulo zero')
		continue
