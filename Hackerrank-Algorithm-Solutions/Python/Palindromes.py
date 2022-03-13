from itertools import combinations
from itertools import permutations as perms
import numpy as np
import math


# def solve(s):
# 	s_len = len(s)

# 	probability = 1/math.comb(s_len,2)

# 	p_matrix = np.eye(s_len-1) * probability
# 	print(p_matrix)
# 	p_matrix = p_matrix - (np.eye(p_matrix.shape[0]) * -1)
# 	p_matrix = np.linalg.inv(p_matrix)
# 	print(p_matrix)

# 	neg_ones = -1 * np.ones((p_matrix.shape[0],1))
# 	print(neg_ones)


# 	print(p_matrix @ neg_ones)

# solve("abb")

# for x in combinations("cbaabbb",2):
# 	print(x)


# for p in perms("abc"):
# 	print(p)

# print(math.comb(3,2))

# print(np.ones((5,1)))
# ar = np.array([[-2/3, 1/3],[1/3,-2/3]])
# print(ar)
# print(np.linalg.inv(ar) @ np.array([[-1],[-1]]))
# print(ar)
ar = np.ones(8) * 1/28
ar = ar - np.eye(8)
print(ar)
print(np.linalg.inv(ar) @ (np.zeros((8,1))-1))