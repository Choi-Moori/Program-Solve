tc = int(input())

for TC in range(1, tc+1):
    num = int(input())
    res = num
    for i in range(1, len(str(num))+1):
        a = 10**i

        res = min(res , num//a + num%a)

    print("#%d"%TC, res)
