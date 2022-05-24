#문제 목표 :  이진탐색을 구현해 보는 것입니다. 사전에 정렬된 리스트에서 탐색한다는 조건 하에서 이진탐색은 순차 탐색에 비해서 훨씬 빠르게 연산 가능합니다.

from sys import stdin

n = int(input())
t = list(map(int,stdin.readline().split()))
t.sort()
m = int(input())
def search(deck,target,start,end): #이진탐색을 위한 함수 간단하게 업*다운 게임을 구현한다고 생각하시면 됩니다.
    while start <= end:
        mm = (start+end)//2 #중앙값을 찾고
        if deck[mm] == target : return True #탐색 값을 찾으면 종료
        elif deck[mm] > target: end = mm -1 #아니라면 다운
        else: start = mm + 1                    #업 중에 분기가 갈린 후 다시 반복합니다.
    return False

# 위 이진탐색 함수는 아래와 같이 재귀함수 구조로도 구현 가능합니다.

'''
def search(deck,target,start,end):
    mm = (start+end)//2
    if start > end: return False
    if deck[mm] == target: return True
    elif deck[mm] > target: return search(deck,target,start,mm-1)
    else: return search(deck,target,mm+1,end)
'''

for i in stdin.readline().split():
    if search(t,int(i),0,n-1): print(1)
    else: print(0)