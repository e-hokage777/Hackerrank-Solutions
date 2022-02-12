def funnyString(s):
    from_head = ""
    from_tail = ""

    len_s = len(s)

    for i in range(len_s-1):
        from_head += str(abs(ord(s[i]) - ord(s[i+1])))
        if(i != len_s-2):
            from_head += "-"



    for i in range(len_s-1,0,-1):
        from_tail += str(abs(ord(s[i]) - ord(s[i-1])))
        if(i != 1):
            from_tail += "-"

    return "Funny" if from_head == from_tail else "Not Funny"



print(funnyString("acxz"))