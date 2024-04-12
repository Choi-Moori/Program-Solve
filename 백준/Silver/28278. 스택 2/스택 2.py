import sys

N = int(sys.stdin.readline())
stack = []

for _ in range(N):
    comd = list(map(int, sys.stdin.readline().split()))

    if comd[0] == 1:
        stack.append(comd[1])
    elif comd[0] == 2:
        print(-1 if not stack else stack.pop())
    elif comd[0] == 3:
        print(len(stack))
    elif comd[0] == 4:
        print(1 if not stack else 0)
    elif comd[0] == 5:
        print(stack[-1] if stack else -1)