def run(t):
    te = list()
    for k in t:
        for i in l:
            try: k.index(i)
            except:
                te.append(k+[i])
    return te

n,m = map(int,input().split())
l = list(range(1,n+1,1))
nl = [[]]
for _ in range(m):
    nl = run(nl)
for i in nl:
    print(str(i)[1:-1].replace(',',''))