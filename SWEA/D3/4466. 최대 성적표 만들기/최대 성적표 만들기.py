tc = int(input())

for TC in range(1, tc+1):
    N, K = map(int , input().split())

    G = list(map(int, input().split()))

    res = 0

    G.sort(reverse=True)

    for i in range(K):
        res += G[i]

    print("#%d"%TC, res)
