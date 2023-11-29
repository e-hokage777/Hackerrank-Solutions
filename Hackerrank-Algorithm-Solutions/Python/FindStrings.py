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

    print(sorted(S)) 

if __name__ == "__main__":
    w = ["aab", "aac"]
    q = [3,3,8,23]

    findStrings(w,q)