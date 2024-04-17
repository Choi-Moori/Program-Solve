n = int(input())

inttri = [list(map(int, input().split())) for _ in range(n)]

for i in range(1, n):
    for j in range(len(inttri[i])):
        if j == 0:
            inttri[i][0] += inttri[i-1][0]
        elif j == len(inttri[i]) -1:
            inttri[i][-1] += inttri[i-1][-1]
        else:
            inttri[i][j] += max(inttri[i-1][j], inttri[i-1][j-1])
print(max(inttri[-1]))