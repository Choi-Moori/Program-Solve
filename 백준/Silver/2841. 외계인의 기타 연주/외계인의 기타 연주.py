import sys
N, P = map(int, input().split())

gitar = [[0] for _ in range(6)]
count = 0

for _ in range(N):
    L, p = map(int, sys.stdin.readline().split())
    if gitar[L-1][-1] == 0:
        gitar[L-1][-1] = p
        count += 1
    elif gitar[L-1][-1] > p:
        while gitar[L-1] and gitar[L-1][-1] > p:
            gitar[L-1].pop()
            count += 1
        if not gitar[L-1] or gitar[L-1][-1] != p:
            gitar[L-1].append(p)
            count += 1
    elif gitar[L-1][-1] < p:
        count += 1
        gitar[L-1].append(p)
print(count)
