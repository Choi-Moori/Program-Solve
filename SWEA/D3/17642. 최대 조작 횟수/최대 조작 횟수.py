tc = int(input())

for TC in range(1, tc+1):
    A, B = map(int, input().split())

    cnt = 0

    if A == B:
        cnt = 0
    elif A > B or B-A == 1:
        cnt = -1
    else:
        cnt = (B-A)//2

    print("#%d"%TC, cnt)

