import sys

n = int(input())
lis = set()

for _ in range(n):
    A, B = map(str, sys.stdin.readline().split())

    if (A == "ChongChong" or B == "ChongChong") or (A in lis or B in lis):
        lis.add(A)
        lis.add(B)

print(len(lis))