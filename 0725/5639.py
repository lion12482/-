import sys
sys.setrecursionlimit(10**9)
def postorder(s, e):
    if s > e:
        return
    mid = e + 1                         
    for i in range(s+1, e+1):
        if nums[s] < nums[i]:
            mid = i
            break

    postorder(s+1, mid-1)               
    postorder(mid, e)                   
    print(nums[s])

nums = list()
while True:
    try:
        nums.append(int(input()))
    except:
        break
if nums:
    postorder(0, len(nums)-1)
