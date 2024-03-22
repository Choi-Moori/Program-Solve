def ucl(a,b):
    maxnum = max(a,b)
    minnum = min(a,b)

    while maxnum != minnum:
        maxnum -= minnum
        temp = maxnum
        maxnum = max(temp, minnum)
        minnum = min(temp, minnum)

    return maxnum

a,b = map(int, input().split())
c,d = map(int, input().split())

resulta , resultb = a+c, b

if b != d:
    resulta = (a*d) + (c*b)
    resultb = (b*d)

result = ucl(resulta,resultb)

print(resulta//result , resultb//result)