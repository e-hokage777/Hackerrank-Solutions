import math

def viralAdvertising(num_of_days):
	shared = 5
	cumulative = 0;
	for i in range(num_of_days):
		liked = math.floor(shared/2)
		shared = liked*3
		cumulative+=liked

	return cumulative

if __name__ == "__main__":
	num_of_days = int(input("Number of days: "))
	print(viralAdvertising(num_of_days));
