import re
import math

def insertion_sort(l):
    for i in range(len(l)):
        j = i-1
        while(j >= 0 and l[i] < l[j]):
            temp = l[i]
            l[i] = l[j]
            l[j] = temp
            
            j-=1
            i-=1

def median(data):
    # insertion_sort(data)
    data = sorted(data)
    median_pos = len(data)/2
    if(median_pos%2 == 0):
        median_pos = int(median_pos)
        return (data[median_pos] + data[median_pos-1])/2
    else:
        return data[math.floor(median_pos)]

def activityNotifications(expenditure, d):
    n = len(expenditure)
    count = 0
    median_window = expenditure[0:d]

    for i in range(n-d):
        median_expenditure = median(median_window)
        target = expenditure[i+d]
        print(median_expenditure)

        if(target >= 2*median_expenditure):
            count += 1

        ## updating the median window
        del median_window[0]
        median_window.append(target)
    
    return count


if __name__ == "__main__":
    n = int(input("Number of transaction days => "))
    d = int(input("Number of trailing days => "))
    expenditure = re.split("\s+", input("Expenidture (space separated) => "))
    expenditure = list(map(int, expenditure))
    # print(n)
    # print(d)
    # print(expenditure)

    if(len(expenditure) == n):
        print(activityNotifications(expenditure, d))
    else:
        print("Wrong Number of expenditure inputs")
