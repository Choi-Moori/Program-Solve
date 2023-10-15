tc = int(input())

for TC in range(1, tc+1):
    A, B , C = map(int, input().split())

    D = min(A,B)

    print("#%d"%TC, C//D)
