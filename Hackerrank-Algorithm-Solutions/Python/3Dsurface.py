
def surfaceArea(A, height, width):
	surfaceArea = 2*(height*width)

	for i in range(height):
		for j in range(width):

			#Checking top side
			if i == 0:
				surfaceArea+=A[i][j]
			else:
				diff = A[i][j]-A[i-1][j]
				surfaceArea += diff if diff > 0 else 0

			#Checking left side
			if j == 0:
				surfaceArea+=A[i][j]
			else:
				diff = A[i][j] - A[i][j-1]
				surfaceArea += diff if diff > 0 else 0

			#checking bottom
			if i == height-1:
				surfaceArea+=A[i][j]
			else:
				diff = A[i][j]-A[i+1][j]
				surfaceArea += diff if diff > 0 else 0

			#checking right side
			if j == width - 1:
				surfaceArea+=A[i][j]
			else:
				diff = A[i][j] - A[i][j+1]
				surfaceArea += diff if diff > 0 else 0

	return surfaceArea





if __name__ == '__main__':
	height, width = map(int, input("Enter height and width: ").split())

	A = []

	for i in range(height):
		A.append(list(map(int,input("Row elements: ").split())))

	result = surfaceArea(A, height, width)

	print(result)