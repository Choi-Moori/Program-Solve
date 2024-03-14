N, K = map(int, input().split())

stuffs = [list(map(int, input().split())) for _ in range(N)]
max_value = 0

dp = [0 for _ in range(K+1)]

for stuff in stuffs:
    N, v = stuff
    for j in range(K, N-1, -1):
        dp[j] = max(dp[j], dp[j-N]+v)

print(dp[-1])