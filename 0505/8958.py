t = int(input())
for i in range(t):
    score =0
    x = input().split('X')
    for k in x:
        n = len(list(k))
        if n:
            score += (n*(n+1))/2
    print(round(score))