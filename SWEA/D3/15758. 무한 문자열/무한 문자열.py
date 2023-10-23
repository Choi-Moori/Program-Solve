tc = int(input())
import math
for TC in range(1, tc+1):
    s1, s2 = input().split()

    res = len(s1) * len(s2) // math.gcd(len(s1), len(s2))

    if s1 * (res // len(s1)) == s2 * (res// len(s2)):
        print("#%d"%TC, "yes")
    else:
        print("#%d"%TC, "no")

