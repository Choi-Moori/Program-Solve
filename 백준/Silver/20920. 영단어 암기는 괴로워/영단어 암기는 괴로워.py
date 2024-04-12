import sys

n, m = map(int, input().split())
word = {}

for _ in range(n):
    a = sys.stdin.readline().rstrip()
    if len(a) >= m:
        if a in word:
            word[a] += 1
        else:
            word[a] = 1

res = sorted(word.items(), key=lambda x: (-x[1], -len(x[0]), x[0]))

for i in res:
    print(i[0])