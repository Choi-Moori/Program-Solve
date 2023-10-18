tc = int(input())

for TC in range(1, tc+1):
    st = list(input())

    res = ''

    if st == st[::-1]:
        res = 'Exist'
    else:
        for i in range(len(st)):
            if st[i] == '?':
                st[i] = st[-i -1]

        if st == st[::-1]:
            res = 'Exist'
        else:
            res = 'Not exist'
    print("#%d"%TC, res)
