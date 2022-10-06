
class Bitree:
    def __init__(self):
        self.left = None
        self.right = None
        self.par = None
        self.val = None

def search(tree,tar):
    if tree.val == tar: return tree
    else:
        if tree.left: 
            r = search(tree.left,tar)
            if r: return r
        if tree.right: 
            r = search(tree.right,tar)
            if r: return r



root = tar = Bitree()

root.val = 'A'

for _ in range(int(input())):
    p,c1,c2 = map(str,input().split())
    tar = search(root,p)
    if c1 != '.':
        tar.right = Bitree()
        tar.right.val = c1
    if c2 != '.':
        tar.left = Bitree()
        tar.left.val = c2


def frp(root):
    print (root.val,end='')
    if root.right:
        frp(root.right)
    if root.left:
        frp(root.left)

def inp(root):
    if root.right:
        inp(root.right)
    print(root.val,end='')
    if root.left:
        inp(root.left)

def bap(root):
    if root.right:
        bap(root.right)
    if root.left:
        bap(root.left)
    print(root.val,end='')


frp(root)
print()
inp(root)
print()
bap(root)
print()