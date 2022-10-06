

from math import comb

dp = [[[]] for _ in range(32)]
dp[0][0] = 1

for i in range(1,31):
    for j in range(i+1):
        dp[i][j] = comb(i,j)



r,c,w = map(int,input().split())
def run(r,c,w):
    res,k =  0,1
    for i in range(r-1,r+w-1):
        for j in range(k):
            res += dp[i][c-1+j]
        k += 1
    return res
print(run(r,c,w))