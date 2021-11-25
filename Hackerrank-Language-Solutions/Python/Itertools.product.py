from itertools import product

A = list(map(int, input("list A elements: ").split()))
B = list(map(int, input("List B elements: ").split()))

print(*product(A,B))