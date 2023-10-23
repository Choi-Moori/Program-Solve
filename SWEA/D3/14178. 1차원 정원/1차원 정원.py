import math

tc = int(input())

for TC in range(1, tc+1):
    N, D = map(int, input().split())

    d = D * 2 + 1
    res = math.ceil(N / d)

    print("#%d"%TC, res)