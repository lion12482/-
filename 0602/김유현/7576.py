from collections import deque

m, n = map(int, input().split())

matrix = [list(map(int, input().split())) for _ in range(n)]

queue = deque([])

dx, dy = [-1,1,0,0], [0,0,-1,1]
res = 0

for i in range(n) :
    for j in range(m) :
        if matrix[i][j] == 1:
            queue.append([i, j])


def bfs() :
    while queue :
        x, y = queue.popleft() # 큐에 들어가있는 시작(1)좌표
        for i in range(4) :
            nx, ny = dx[i] + x , dy[i] + y  # -1,0(왼쪽으로 한칸) | 1,0(오른쪽으로 한칸) | 0,-1(위로 한칸) | 0,1(아래로 한칸) 
            if 0 <= nx < n and 0 <= ny < m and matrix[nx][ny] == 0 : # matrix[nx][ny] == 0 이 조건부는 토마토가 익지 않았음을 확인하는 것
                matrix[nx][ny] = matrix[x][y] + 1 # 이동하는 좌표에 이동한 횟수 기입시켜줌
                queue.append([nx,ny]) 
                
bfs()

for i in matrix :
    for j in i:
        if j == 0 :
            print(-1)
            exit(0)

    res = max(res, max(i))

print(res -1)