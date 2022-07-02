n = int(input())
t = list()
for _ in range(n):
    t.append(int(input()))
def run(n):    
    if n <=2:
        return sum(t)
    dp = [0 for _ in range(n)]
    dp[0] = t[0]
    dp[1] = sum(t[0:2])
    dp[2] = max(t[2]+t[1], t[2]+t[0], t[1]+t[0])
    for i in range(3,n):
        dp[i] = max(dp[i-1],dp[i-3]+t[i-1]+t[i], dp[i-2]+t[i])
    return dp[n-1]
print(run(n))

    