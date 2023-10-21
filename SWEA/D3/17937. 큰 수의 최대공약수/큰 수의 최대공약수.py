tc = int(input())


for TC in range(1, tc+1):
    num1, num2 = map(int , input().split())

    if num1 < num2:
        print("#%d"%TC, 1)
    else:
        print("#%d"%TC, num2)