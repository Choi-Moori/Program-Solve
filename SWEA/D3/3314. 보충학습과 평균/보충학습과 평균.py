tc = int(input())

for TC in range(1, tc+1):
    res = 0

    num_l = list(map(int,input().split()))

    for i in num_l:
        if i < 40:
            i = 40
        res += i

    print("#%d"%TC, res//5)

