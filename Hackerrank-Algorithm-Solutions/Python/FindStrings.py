def get_substrings(string):
    n = len(string)
    substrings = set()

    for i in range(n):
        for j in range(i+1,n+1):
            substrings.add(string[i:j])

    return substrings


def findStrings(w, queries):
    S = set()
    for string in w:
        S = S.union(get_substrings(string))

    S = sorted(S)

    result = []
    for query in queries:
        if query <= len(S):
            result.append(S[query-1])
        else:
            result.append("INVALID")

    return result

if __name__ == "__main__":
    n = int(input("Number of Strings => "))
    strings = []
    queries = []

    for i in range(n):
        strings.append(input("Add String => "))

    queries = list(map(int, input("Indices to query(Space separated): ").split()))

    print("\n".join(findStrings(strings,queries)))