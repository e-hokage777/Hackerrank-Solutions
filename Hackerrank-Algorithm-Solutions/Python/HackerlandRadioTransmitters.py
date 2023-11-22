
def binary_search(l, left, right, value):
    while left < right:
        middle = (left + right)//2
        if l[middle] == value: return middle
        elif value > l[middle]: left = middle + 1
        else: right = middle - 1

    return left

def find_stop(l, start, stop, value):
    i = start
    while i < stop and l[i] <= value:
        i+=1

    return i-1

def hackerlandRadioTransmitters(x, k):
    x = sorted(x)
    n = len(x)
    transmitter_count = 0
    i = 0
    while i <= n-1:
        middle = x[i] + k
        middle_idx = find_stop(x, i, n, middle)

        end = x[middle_idx] + k
        end_idx = find_stop(x, middle_idx, n, end)

        i = end_idx+1
        transmitter_count += 1

    return transmitter_count


if __name__ == "__main__":
    n,k = map(int, input("Number of houses and transmitter range (space separated): ").split())
    x = list(map(int, input("Locations of houses (space separated): ").split()))

    print(hackerlandRadioTransmitters(x, k))