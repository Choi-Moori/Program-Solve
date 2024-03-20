N = int(input())

dp = [5000] * (N+1)
weight = [3,5]

dp[0] = 0
#
# for i in range(2):
#     for j in range(2, N+1):
#         if j % weight[i] == 0:
#             dp[j] = min(dp[j], j//weight[i])
#
#         print(dp)
#
#         if dp[j-weight[i]] != 5000 and j-weight[i] >=0:
#             dp[j] = min(dp[j], j//weight[i] + dp[j-weight[i]])

for i in range(2):
    for j in range(2, N+1):
        if j%weight[i] == 0:
            dp[j] = dp[j-weight[i]]+1

        if dp[j-weight[i]] != 5000 and j - weight[i] >= 0:
            dp[j] = min(dp[j], dp[j-weight[i]] + 1)

if dp[-1] == 5000:
    print(-1)
else:
    print(dp[-1])