n, k = map(int, input().split())
c = []
for _ in range(n):
    c.append(int(input()))

dp = [0] * (k+1)
dp[0] = 1


for coin in c :
    for i in range(coin, k+1):
        dp[i] += dp[i-coin]

print(dp[k])