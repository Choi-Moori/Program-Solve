import sys

T = int(sys.stdin.readline())

m = 1000001
prime_num_bool = [False, False] + [True] * (m-1)
primes = []
for i in range(2, m):
    if prime_num_bool[i]:
        primes.append(i)

        for j in range(2*i, m, i):
            prime_num_bool[j] = False

for _ in range(T):
    count = 0
    n = int(sys.stdin.readline())
    for i in primes:
        if i >= n:
            break
        if prime_num_bool[n - i] and i <= n-i:
            count += 1
    print(count)