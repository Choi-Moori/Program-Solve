tc = int(input())

for TC in range(1, tc+1):
    st = input().rstrip()
    lim = 15
    res = ''
    
    for i in st:
        if i == 'x':
            lim -= 1

    
    if lim >= 8:
        res = 'YES'
    else:
        res = 'NO'


    print("#%d"%TC, res)
