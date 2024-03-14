T = int(input())

for _ in range(T):
    N = int(input())
    coins = list(map(int, input().split()))
    M = int(input())

    dp = [[0] * (M+1) for _ in range(N)]

    for i in range(N):
        dp[i][0] = 1

    for i in range(N):
        for j in range(M+1):
            dp[i][j] = dp[i-1][j]
            if j - coins[i] >= 0:
                dp[i][j] += dp[i][j-coins[i]]

    print(dp[N-1][M])