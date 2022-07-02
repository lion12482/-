from sys import stdin
n = int(input())
t = list(map(int,stdin.readline().split()))
t.sort()
m = int(input())
c = list(map(int, stdin.readline().split()))

def search(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        if array[mid] == target: return True
        elif array[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return False

for i in range(m):
    if search(t, c[i], 0, n - 1): print(1, end=' ')
    else: print(0, end=' ')