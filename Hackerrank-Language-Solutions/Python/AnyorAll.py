input("Enter number of integers: ")
integers = list(map(int, input("Integers: ").split()))
print(all([a>0 for a in integers]) and any([(str(a)[::-1] == str(a)) for a in integers]))