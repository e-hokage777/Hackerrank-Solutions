def separateNumbers(s):
    step = 0
    current = 0
    results = []


    for i in range(int(len(s)/2)):
            results.append(separate(s, i+1))

    if len(results) == 0:
        print("NO")
        return

    answer = min(results)

    print("NO" if answer == 111111111111111111111 else "YES " + str(answer))


def separate(s,step):
    current_ind = 0
    next_ind = current_ind + step
    beautiful = False
    min_num = s[current_ind: current_ind + step] 

    while (next_ind + step) <= len(s):
        current_str = s[current_ind : current_ind + step]
        next_str = s[next_ind : next_ind + step]
        next_str2 = s[next_ind : next_ind + step+1]


        current_num = int(current_str)
        next_num = int(next_str)
        next_num2 = int(next_str2)

        if current_str[0] == "0" or next_str[0] == "0":
            break

        if next_num - current_num == 1:
            #checking if on the last number
            if next_ind + step == len(s):
                beautiful = True

            current_ind += step
            next_ind += step

        elif next_num2 - current_num == 1:

            current_ind += step
            step+=1
            next_ind += step

            if next_ind + step >= len(s):
                beautiful = True

        else:
            break


    return int(min_num) if beautiful else 111111111111111111111


print(separateNumbers("1"))



