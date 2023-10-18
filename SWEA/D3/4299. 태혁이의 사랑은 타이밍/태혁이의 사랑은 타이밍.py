tc = int(input())

for TC in range(1, tc+1):
    D,H,M = map(int , input().split())
    res = 0
    if D >= 11 :
        res = (D-11)*24*60
        res += (H-11)*60
        res += M-11

        if res < 0:
            res = -1
    print("#%d"%TC,res)
