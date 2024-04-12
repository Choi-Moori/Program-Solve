n = int(input())

dp = [[0] * 30 for _ in range(29)]

for i in range(1, 31):
    dp[0][i-1] = i

for i in range(1, 29):
    for j in range(1, 30):
        if i == j:
            dp[i][j] = 1
        elif j>i:
            dp[i][j] = dp[i][j-1]+dp[i-1][j-1]

for _ in range(n):
    m,n = map(int, input().split())
    print(dp[m-1][n-1])
