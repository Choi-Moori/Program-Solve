from collections import deque
import sys
deq = deque()

N = int(sys.stdin.readline())

for _ in range(N):
    com = list(sys.stdin.readline().split())
    process = com[0]
    if process == '1':
        deq.appendleft(int(com[1]))
    elif process == '2':
        deq.append(int(com[1]))
    elif process == '3':
        print(deq.popleft() if deq else -1)
    elif process == '4':
        print(deq.pop() if deq else -1)
    elif process == '5':
        print(len(deq))
    elif process == '6':
        print(0 if deq else 1)
    elif process == '7':
        print(deq[0] if deq else -1)
    elif process == '8':
        print(deq[-1] if deq else -1)