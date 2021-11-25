def merge_the_tools(string, k):
    # your code goes here
    string_length = len(string)

    for n in range(0,string_length,k):
        sub_string = string[n:n+k]
        sub = {}
        for i in sub_string:
            sub[i] = i

        print("".join(sub.keys()))

if __name__ == '__main__':
    string, k = input("String: "), int(input("Substring size: "))
    merge_the_tools(string, k)


#Neat trick
# S, N = input(), int(input()) ---line 1
# for part in zip(*[iter(S)] * N): ---line 2
#     d = dict() ---line 3
#     print(''.join([ d.setdefault(c, c) for c in part if c not in d ])) --- line 4

#LINE 2 CREATES THREE ITERATORS THAT POINT TO THE SAME DATA SET
#SO AS YOU CALL NEXT FOR EACH SET, THE ELEMENT IS REMOVED FROM ALL
#HENCE WORKS