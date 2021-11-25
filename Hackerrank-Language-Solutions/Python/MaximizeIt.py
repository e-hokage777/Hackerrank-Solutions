from itertools import product

num_of_lists, modulo = map(int, input("Number of lists and modulo: ").split())

lists = (list(map(int, input("List elements: ").split()))[1:] for i in range(num_of_lists))

results = list(map(lambda x : sum(i**2 for i in x), product(*lists)))
print(max(results))
