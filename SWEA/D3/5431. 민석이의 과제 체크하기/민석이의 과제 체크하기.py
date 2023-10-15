tc = int(input())

for TC in range(1, tc+1):
    N , K = map(int, input().split())

    data = [i for i in range(1, N+1)]

    num = list(map(int, input().split()))

               
    print("#%d"%TC, end=' ')

    for i in data:
        if i not in num:
            print(i, end=' ')

    print()
