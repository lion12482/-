def run():
    n = int(input())
    tl = list(map(int,input().split()))
    tl.sort(reverse=True)
    k = 0 
    for i in tl:
        k += i/tl[0]*100
    print(k/n)

run()