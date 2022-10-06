from collections import deque
from sys import stdin


class main():
    def __init__(self):
        self.re =list()
        self. bd = list()
    def st(self):        
        for _ in range(int(input())):
            n,m = map(int,input().split())
            self.bd = [[] for _ in range(n+1)]
            self.re = list()
            tt = [0 for _ in range(n+1)]
            di = [0 for _ in range(n+1)]
            i =0
            dt= [0,]+list(map(int,stdin.readline().split()))
            for _ in range(m):
                i,f = map(int,stdin.readline().split())
                self.bd[i].append(f)
                di[f] += 1
            tl = list()
            q = deque()
            for i in range(1,n+1):
                if di[i]: pass
                else: 
                    q.appendleft(i)
                tt[i] = dt[i]
            target = int(input())
            while q:
                tar = q.pop()
                for i in self.bd[tar]:
                    tt[i] = max(tt[tar]+dt[i],tt[i])
                    di[i] -= 1
                    if di[i] == 0:
                        if i == target: break
                        q.appendleft(i)
            print(tt[target])
a = main()
a.st()
