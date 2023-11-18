tc = int(input())

for TC in range(1, tc+1):
    num = int(input())
    st = input()

    res = "No"
    if(num == 1):
        res = "No"
    else:
        st1 = st[0:num//2]
        st2 = st[num//2:]
        if(st1 == st2):
            res = "Yes"
        else:
            res = "No"

    print("#%d"%TC, res)
