n, m = map(int,input().split())

visit = [True] * n
num = []
res = []

def dfs(visit, num, depth, at):
    if depth == m:
        for i in num:
            print(i, end= ' ')
        print()
        return

    for i in range(at, n):
        if visit[i]:
            visit[i] = False
            num.append(i+1)
            dfs(visit, num, depth+1, i+1)

            visit[i] = True
            num.pop()

dfs(visit, num, 0, 0)