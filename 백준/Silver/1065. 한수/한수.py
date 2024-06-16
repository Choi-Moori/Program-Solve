import sys
input = sys.stdin.readline
num = int(input().rstrip())
count = 0

if num < 100:
    count = num
else:
    count += 99
    for i in range(100, num+1):
        one = i%10
        ten = (i%100)//10
        hnd = i // 100
        if one - ten == ten - hnd:
            count += 1
        else:
            continue
    

print(count)
