n = int(input("Number of rooms: "))
roomNums = list(map(int, input("Rooms: ").split()))
rooms = {}

for i in roomNums:
	rooms[i] = rooms.get(i,0)+1

for r, n in rooms.items():
	if n == 1:
		print(r)
		break;

#1 2 3 6 5 4 4 2 5 3 6 1 6 5 3 2 4 1 2 5 1 4 3 6 8 4 3 1 5 6 2
