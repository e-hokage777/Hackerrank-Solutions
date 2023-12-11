def introTutorial(V, arr):
    return arr.index(V)

if __name__ == "__main__":
    V = int(input("Value to find index for => "))
    n = int(input("Siz of Array => "))
    arr = list(map(int, input("Space separated array values => ").split()))

    print(introTutorial(V, arr))