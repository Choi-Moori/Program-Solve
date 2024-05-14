n = int(input())

distant = list(map(int, input().split()))
cost = list(map(int, input().split()))
res = 0
temp = cost[0]

for i in range(n-1):
    res += distant[i] * temp

    temp = min(temp, cost[i+1])

print(res)