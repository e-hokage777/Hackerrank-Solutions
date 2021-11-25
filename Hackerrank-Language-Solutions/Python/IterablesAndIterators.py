from itertools import combinations

alphabets = sorted(input('Enter string: ').replace(' ', ''))

k = int(input("Enter group size: "))

combinations = list(combinations(alphabets, k))

a_count = 0

for combination in combinations:
    if combination[0] == 'a':
        a_count+=1;

print('%.4f'%(a_count/len(combinations)))




