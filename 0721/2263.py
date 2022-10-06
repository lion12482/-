class Bitree:
    def __init__(self):
        self.left = None
        self.right = None
        self.val = None


def search(tree,tar,cut):
    tree.val = cut[-1]
    tar1 = tar2 = cut1 = cut2 = None
    ni = tar.index(cut[-1])
    tar1,tar2 = tar[:ni],tar[ni+1:]
    cut1,cut2 = cut[:len(tar1)],cut[len(tar1):-1]
    if tar1 and cut1: 
        tree.left =Bitree()
        search(tree.left,tar1,cut1)
    if tar2 and cut2:
        tree.right = Bitree()
        search(tree.right,tar2,cut2)

def frp(root):
    print(root.val,end=' ')
    if root.left:
        frp(root.left)
    if root.right:
        frp(root.right)


n = int(input())
tar = list(map(int,input().split()))
cut = list(map(int,input().split()))

head =Bitree()
search(head,tar,cut)

frp(head)
print()