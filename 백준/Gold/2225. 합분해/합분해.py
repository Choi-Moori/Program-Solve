N, K = map(int , input().split())

dp = [[0] * (N+1) for _ in range(K)]

for i in range(K):
    dp[i][0] = 1

for i in range(K):
    for j in range(1, N+1):
        dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000000

print(dp[-1][-1])