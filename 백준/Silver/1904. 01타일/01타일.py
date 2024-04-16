n = int(input())

dp = []

for i in range(4):
    dp.append(i)

if n >= 4:
    for i in range(4, 1000001):
        dp.append((dp[i-1]+dp[i-2]) % 15746)
        
print(dp[n])
