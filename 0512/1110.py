n = int(input())
i =0
def run(n):
    if n < 10: 
        return int(str(n)*2)
    else:
        k = int(str(n)[-1])
        j = int(str(n)[-2])
        return int(str(k)+str(j+k)[-1])
te = n
while True:
    i += 1
    t = run(te)
    if t == n : break
    else: te = t
print(i)
        
    