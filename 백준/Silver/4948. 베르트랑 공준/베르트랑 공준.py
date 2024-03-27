import sys

a = 123456
b = a*2
prime = [False] * (b+1)
prime[0] = prime[1] = True
for i in range(2, b + 1):
    if not prime[i]:
        j = 2

        while i * j <= b:
            prime[i * j] = True
            j += 1
n = int(sys.stdin.readline())
while n != 0:
    m = 2*n
    count = 0

    for i in range(n+1, m+1):
        if not prime[i]:
            count += 1

    print(count)
    n = int(sys.stdin.readline())
