import sys
from collections import deque
N = int(sys.stdin.readline())

# 0 : que, 1 : stack
A = list(map(int, sys.stdin.readline().split()))
B = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
C = list(map(int, sys.stdin.readline().split()))

res = deque()

for i in range(N):
    if A[i] == 0:
        res.appendleft(B[i])

for i in range(M):
    res.append(C[i])
    print(res.popleft(), end= ' ')