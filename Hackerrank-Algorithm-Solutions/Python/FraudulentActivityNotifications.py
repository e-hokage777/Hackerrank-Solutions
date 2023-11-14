import re
import math

## variant of binary search that returns the index where the data
## should be in the event that it is not found
def bin_search(l, data):
    left = 0
    right = len(l) - 1

    while left <= right:
        middle = (left+right)//2

        ## return if found
        middle_val = l[middle]
        if middle_val == data: return middle
        elif data < middle_val: right = middle - 1
        elif data > middle_val: left = middle + 1

    return left

def median(data):
    median_pos = len(data)/2
    if median_pos % 2 == 0:
        median_pos = int(median_pos)
        return (data[median_pos] + data[median_pos - 1]) / 2
    else:
        return data[math.floor(median_pos)]


def update_median_window(window, to_remove, to_add):
    idx = bin_search(window, to_remove) ## try coing a binary search here
    del window[idx]
    idx = bin_search(window, to_add)
    window.insert(idx,to_add)

def activityNotifications(expenditure, d):
    n = len(expenditure)
    count = 0

    if(d==n): return count

    median_window = sorted(expenditure[0:d])

    for i in range(n - d):
        median_expenditure = median(median_window)
        to_remove = expenditure[i]
        target = expenditure[i + d]

        if target >= 2 * median_expenditure:
            count += 1

        update_median_window(median_window, to_remove, target)

    return count


if __name__ == "__main__":
    n = int(input("Number of transaction days => "))
    d = int(input("Number of trailing days => "))
    expenditure = re.split("\s+", input("Expenidture (space separated) => "))
    expenditure = list(map(int, expenditure))

    if len(expenditure) == n:
        print(activityNotifications(expenditure, d))
    else:
        print("Wrong Number of expenditure inputs")

