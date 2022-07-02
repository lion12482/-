n = int(input())
def run(n):
    if  n > 20: init = n-10*len(str(n))
    else: init = 0
    for i in range(init,n+1,1):
        if i+sum([int(k) for k in list(str(i))]) == n:
            return i
    return 0
print(run(n))