from sys import stdin
n,m = map(int,input().split())
tar = list(map(int,stdin.readline().split()))
tar = [0] + tar
for i in range(1,len(tar),1):
    tar[i] +=tar[i-1]

for _ in range(m):
    i,f = map(int,stdin.readline().split())
    print(tar[f]-tar[i-1])
    