d = dict()
d[0] = 0
d[1] = 1
def run(n):
    if d.get(n): pass
    else:
        if d.get(n-1):
            d[n] = d[n-1] + d[n-2]
        else:
            l = list(d.keys())
            l.sort()
            for i in range(l.pop(),n+1):
                run(i)
ip = int(input())
run(ip)
print(d[ip])
                