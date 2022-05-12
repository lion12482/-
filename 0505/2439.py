n = int(input())
for i in range(n):
    t = str()
    for k in range(i+1): 
        t += '*'
    t = str(t.rjust(n))
    print(t)