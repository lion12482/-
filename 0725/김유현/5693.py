# 문제, 입력 그리고 출력
# 주어진 이진트리의 전위순회를 입력받아서 후위순회를 출력한다. * 정해진 노드의 수는 없다
# 입력 : 이진트리의 전위순회 (루트 왼쪽 오른쪽) 
# 출력 : 이진트리의 후위순회 (왼쪽 오른쪽 루트)

import sys
sys.setrecursionlimit(10**6)
num_list = []
while True:
    try:
        num = int(input())
        num_list.append(num)
    except:
        break

def postorder(first, end):
    if first > end:
        return
    
    mid = end + 1
    for i in range(first + 1, end + 1): 
        if num_list[first] < num_list[i]: #50 < 30
            mid = i #
            # print("mid 값 변경! :", mid,"num_list[first]값은 : ", num_list[first], "num_list[i] 값은 :", num_list[i])
            break
    postorder(first+1, mid-1) 
    postorder(mid, end) 
    print(num_list[first])
    
postorder(0, len(num_list)-1) # 0, 8