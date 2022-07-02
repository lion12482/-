from sys import stdin
n = int(input())
td = dict()
for i in range(10001):
    td[i] = False
for _ in range(n):
    k = int(stdin.readline())
    if td.get(k): td[k] += 1
    else: td[k] = 1
for k in td.keys():
    for _ in range(td[k]): print(k)
        