n = int(input("Number of lines: "))

List = list()

for m in range(n):
	command = input("Command: ").split(' ')
	if command[0] == 'insert':
		try:
			List.insert(int(command[1]),int(command[2]))
		except:
			continue
	elif command[0] == 'remove':
		try:
			List.remove(int(command[1]))
		except:
			continue
	elif command[0] == 'append':
		try:
			List.append(int(command[1]))
		except:
			continue
	elif command[0] == 'sort':
		List.sort()
	elif command[0] == 'pop':
		try:
			List.pop()
		except:
			continue
	elif command[0] == 'reverse':
		List.reverse()
	elif command[0] == 'print':
		print(List)
