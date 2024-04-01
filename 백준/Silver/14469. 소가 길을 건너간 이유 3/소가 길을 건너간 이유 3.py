n = int(input())

time = [list(map(int, input().split())) for _ in range(n)]

list.sort(time)
sum = time[0][0] + time[0][1]

for i in range(1, n):
    if sum < time[i][0]:
        sum = time[i][0]
        sum += time[i][1]
    else:
        sum += time[i][1]
print(sum)