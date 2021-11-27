import math

def howManyGames(start, decrease, limit, budget):
	decrease = -1 * decrease
	#Finding how many can be bought before limit
	num_before_limit = math.floor((limit + decrease - start)/decrease)
	print(num_before_limit)

	#checking if sum before limit is > budget
	total_before_limit = (num_before_limit/2)*(2*start + num_before_limit*decrease - decrease)
	print(total_before_limit)

	if total_before_limit > budget:
		return math.floor((-(2*start-decrease) + math.sqrt(pow(2*start-decrease,2)- 4*decrease*(-2*budget)))/(2*decrease));

	else:
		return num_before_limit + math.floor((budget - total_before_limit)/limit)



if __name__ == "__main__":
	print(howManyGames(*map(int, input("Start, decrease, limit, budget: ").split())))