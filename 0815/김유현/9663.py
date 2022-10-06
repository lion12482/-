# 백트래킹 문제를 dfs 알고리즘을 통해 풀이한 코드입니다.

n = int(input())

ans = 0
row = [0] * n


def is_promising(x) :
    for i in range(x) :
        if row[x] == row[i] or abs(row[x] - row[i]) == abs(x-i) :    
            return False
            # 퀸을 놓지 못하는 경우는 
            # 1. 같은 열 row[i] 가 row[x] 와 같은 값일 경우 
            # 2. 왼쪽 대각선, 오른쪽 대각선 abs(row[x] - row[i]) == abs(x-i) 에 해당한다
            # abs 는 매개변수 안 계산 결과값에 절대값을 반환하는 함수로 놓여진 퀸좌표(i, j)에서 각각 x값과 y 값을 빼준 값이 동일한 경우를 찾는다
    return True

def n_queens(x):
    global ans
    if x == n :
        ans += 1
        return

    else :
        for i in range(n):
            row[x] = i
            if is_promising(x):
                n_queens(x+1)

n_queens(0)
print(ans)