n = int(input())

num = [0] * 10001
dp = [0] * 10001

for i in range(n):
    num[i] = int(input())

dp[0] = num[0]
dp[1] = num[0] + num[1]
dp[2] = max(dp[1], num[0]+num[2], num[1]+num[2])

for i in range(3, n):
    dp[i] = max(dp[i-1], dp[i-2]+num[i], dp[i-3]+num[i-1]+num[i])

print(max(dp))