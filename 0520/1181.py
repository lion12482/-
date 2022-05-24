N = int(input())
d = dict()
for _ in range(N):
    ipt = str(input())
    if d.get(len(ipt)): 
        d[len(ipt)] += [ipt]
    else: 
        d[len(ipt)] = [ipt]
for k in sorted(d.keys()):
    te = list(set(d[k]))
    te.sort()
    for i in te: print(i)