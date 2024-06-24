import sys

input = sys.stdin.readline
num = int(input().rstrip())
s_list = []

for _ in range(num):
    s_list.append(input().split())

s_list.sort(key = lambda x : (-int(x[1]),int(x[2]),-int(x[3]),x[0]))

for i in range(num):
    print(s_list[i][0])
