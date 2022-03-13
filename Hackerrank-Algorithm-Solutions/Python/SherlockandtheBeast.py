def decentNumber(n):
    threes = 0
    fives = 0

    if n%3 == 1:
        threes += 10
        n -= 10
    elif n%3 == 2:
        threes += 5
        n-=5

    fives += n

    if fives >= 0 and fives % 3 == 0:
        print("5"*fives + "3"*threes)

    else:
        print(-1)

	# while n > 0:
	# 	if n % 3 == 0:
	# 		fives += n
	# 		n = 0
	# 		break

	# 	threes += 5
	# 	n -= 5


	# if n < 0:
	# 	return -1

	# return "5"*fives + "3"*threes



print(decentNumber(5))


