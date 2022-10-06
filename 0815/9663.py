
n = int(input())

row = [0]*n
r = 0 
f = [False ]* n


def q(tp):
    for i in range(tp):
        if abs(row[tp]-row[i]) == tp-i:
            return False
    return True
def nq(x):
    global r
    if x == n:
        r += 1
        return
    for i in range(n):
        if f[i]: continue
        row[x] = i
        if q(x):
            f[i] = True
            nq(x+1)
            f[i] = False



nq(0)
print(r)