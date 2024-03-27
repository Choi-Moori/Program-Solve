import sys
M, N = map(int, sys.stdin.readline().split())

prime = [False]*(N+1)

prime[0] = prime[1] = True

for i in range(2, N+1):
    if not prime[i]:
        j = 2

        while i*j <= N:
            prime[i*j] = True
            j += 1


for i in range(M, N+1):
    if not prime[i]:
        print(i)
