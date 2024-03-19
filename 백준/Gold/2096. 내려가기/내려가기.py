N = int(input())

points = list(map(int, input().split()))

maxdp = points
mindp = points


for _ in range(1, N):
    a,b,c = map(int , input().split())
    maxdp = [a+max(maxdp[0],maxdp[1]),b+max(maxdp),c+max(maxdp[1],maxdp[2])]
    mindp = [a+min(mindp[0],mindp[1]),b+min(mindp),c+min(mindp[1],mindp[2])]

print(max(maxdp), min(mindp))
