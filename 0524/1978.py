import math
p = set()
def run(n):
    t  = list()
    for i in range(2,n+1,1):
        t.append(i)
    for i in t:
        try:
            for k in p:
                if i%k == 0 : raise
            p.add(i)
        except: pass
        j = 1
        while True:
            j += 1
            if j in p and j !=i: pass
            else:
                try: 
                    t.remove(j*i)
                except:
                    break
a = input()
l = list(map(int,input().split()))
run(1000)
i = 0
for k in l:
    if k in p: i +=1
print(i)