import sys
read = sys.stdin.readline

N, K = map(int, read().split()) # n 물건수, k 최대무게 설정
cache = [0] * (K + 1)

for _ in range(N) :
    w, v = map(int, read().split()) # 들어갈 물건 무게와 가치 설정
    for j in range(K, w-1, -1): # 최대무게로부터 들어갈 물건 무게까지 -1씩 반복
        cache[j] = max(cache[j], cache[j-w] + v)

print(cache[-1]) # cache 리스트 제일 끝 요소 출력