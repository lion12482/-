import sys
import heapq

INF = float('inf')
V,E = map(int, input().split())
K = int(input())

graph = [[] for _ in range(V + 1)]

answer = [INF] * (V + 1)
queue = []

for i in range(E):
    u, v, w = map(int, input().split())
    graph[u].append([v,w])

answer[K] = 0
heapq.heappush(queue, [0, K])

while queue :
    current_w, current_node = heapq.heappop(queue)
    
    if answer[current_node] < current_w :
        continue
    
    for next_node, weight in graph[current_node] :
        next_w = current_w + weight

        if next_w < answer[next_node] :
            answer[next_node] = next_w
            heapq.heappush(queue, [next_w, next_node])

for i in answer[1:]:
    print(i if i != INF else "INF")