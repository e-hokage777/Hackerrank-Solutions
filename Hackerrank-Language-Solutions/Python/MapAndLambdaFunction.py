cube = lambda x: x**3; 

def fibonacci(n):
    sequence = []

    for i in range(n):
        if i == 0:
            sequence.append(i)
        elif i == 1:
            sequence.append(i)
        else:
            sequence.append(sequence[i-1] + sequence[i-2])

    return sequence


if __name__ == '__main__':
    n = int(input("Number of elements: "))
    print(list(map(cube, fibonacci())))