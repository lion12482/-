from sys import stdin
temp = [False,]
temp += [False] + temp*2000000
for _ in range(int(input())):
    temp[int(stdin.readline())+1+1000000] = True
for i in range(len(temp)-1):
    if temp[i+1]: print(i-1000000)