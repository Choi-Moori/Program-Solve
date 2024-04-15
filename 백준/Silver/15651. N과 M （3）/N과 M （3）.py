n, m = map(int, input().split())

num = []

def dfs(num, depth):
    if depth == m:
        for i in num:
            print(i, end = ' ')
        print()
        return

    for i in range(n):
        num.append(i+1)
        dfs(num, depth+1)
        num.pop()

dfs(num, 0)



