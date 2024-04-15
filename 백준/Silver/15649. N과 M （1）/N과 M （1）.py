n, m = map(int, input().split())

visit = [True] * n
num = []


def dfs(visit, num, depth):
    if depth == m:
        for i in num:
            print(i, end=' ')
        print()
        return

    for i in range(n):
        if visit[i]:
            visit[i] = False
            num.append(i + 1)
            dfs(visit, num, depth + 1)

            visit[i] = True
            num.pop()


dfs(visit, num, 0)
