tc = int(input())

for TC in range(1, tc+1):
    N = int(input())

    num_list  = list(map(int, input().split()))

    num_list.sort()

    print("#%d"%TC, end= ' ')

    for i in num_list:
        print(i, end = ' ')

    print()
