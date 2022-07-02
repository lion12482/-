from sys import stdin
from collections import deque
def run():
    n,m = map(int,input().split())
    tb = [[[]for _ in range(n)] for _ in range(m)]
    tl = list()
    for y in range(m):
        x = 0
        for t in map(int,stdin.readline().split()):
            tb[y][x] = t
            if t == 1: tl.append((y,x))
            x += 1
    q = deque()
    q.append(tl)
    cnt = 0
    while q[0]:
        t = q.pop()
        tl = list()
        c = False
        for tar in t:
            x0 = tar[1]
            y0 = tar[0]
            for y in range(tar[0]-1,tar[0]+2):
                if y <m and 0<=y:
                    if tb[y][x0] == 0: 
                        tb[y][x0] = 1
                        c = True
                        tl.append((y,x0))
            for x in range(tar[1]-1,tar[1]+2):
                if x < n and 0<=x :
                    if tb[y0][x] == 0: 
                        tb[y0][x] = 1
                        c = True
                        tl.append((y0,x))
        if c: cnt += 1
        q.append(tl)
    c = False
    for x in tb:
        if 0 in x: c = True
    if c: print(-1)
    else: print(cnt)

run()