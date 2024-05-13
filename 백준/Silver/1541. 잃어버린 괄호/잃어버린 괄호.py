def split_num(n):
    data = []
    num = ''
    for char in n:
        temp = 0
        if char.isdigit():
            num += char
        else:
            if num:
                data.append(num)
                num = ''
            data.append(char)

    if num:
        data.append(num)

    return data


n = input()
dat = split_num(n)
res = int(dat[0])
sw = True

for i in range(1, len(dat)):

    if dat[i] == "-":
        sw = False
    elif sw and dat[i].isdigit():
        res += int(dat[i])

    if not sw and dat[i].isdigit():
        res -= int(dat[i])


print(res)
