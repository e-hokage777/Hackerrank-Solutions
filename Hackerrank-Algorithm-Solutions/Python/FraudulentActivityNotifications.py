import re
import math



def insertion_sort(l):
    for i in range(len(l)):
        if i > len(l)/2: return
        j = i-1
        while(j >= 0 and l[i] < l[j]):
            temp = l[i]
            l[i] = l[j]
            l[j] = temp
            
            j-=1
            i-=1

def bubble_sort(l):
    n = len(l)
    swapped = False
    for i in range(n-1):
        for j in range(n-1-i):
            if l[j] > l[j+1]:
                temp = l[j+1]
                l[j+1] = l[j]
                l[j] = temp
                swapped = True

        if not swapped:
            return
        elif i > n/2:
            return

def median(data):
    bubble_sort(data)
    median_pos = len(data)/2
    if(median_pos%2 == 0):
        median_pos = int(median_pos)
        return (data[median_pos] + data[median_pos-1])/2
    else:
        return data[math.floor(median_pos)]

def activityNotifications(expenditure, d):
    n = len(expenditure)
    count = 0

    for i in range(n-d):
        median_expenditure = median(expenditure[i:i+d])
        target = expenditure[i+d]

        if(target >= 2*median_expenditure):
            count += 1
    
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
