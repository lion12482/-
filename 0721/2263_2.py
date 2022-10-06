import sys
sys.setrecursionlimit(10**9)

def preorder(start, end, ps, pe):
    if(start > end) or (ps > pe):
        return
    par = postorder[pe]
    print(par, end=" ")

    left = l[par] - start
    preorder(start,  start+left-1, ps, ps+left-1) 
        
    right = end - l[par]
    preorder(end-right+1,  end, pe - right, pe - 1)

n = int(input())
inorder = list(map(int, input().split()))
postorder = list(map(int, input().split()))

l = [0]*(n+1)
for i in range(n):
    l[inorder[i]] = i

preorder(0, n-1, 0, n-1)