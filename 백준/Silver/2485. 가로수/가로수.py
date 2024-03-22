import sys
def ucl(a, b):
    while b>0:
        a, b = b, a%b
    return a


N = int(sys.stdin.readline())

num_list = []
sub_list = []
count = 0

for i in range(N):
    num_list.append(int(sys.stdin.readline()))

for i in range(N-1):
    sub_list.append(num_list[i+1] - num_list[i])

g = sub_list[0]
for j in range(1, len(sub_list)):
    g = ucl(g, sub_list[j])

for i in sub_list:
    count += (i //g)-1

print(count)