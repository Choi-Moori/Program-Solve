import sys
input = sys.stdin.readline

s = input().rstrip()
q = int(input().rstrip())

for _ in range(q):
    num = [0] * 26
    a,st,en = input().split()
    
    st, en = int(st), int(en)
    for i in s[st:en+1]:
        num[ord(i)-97] += 1

    print(num[ord(a)-97])
