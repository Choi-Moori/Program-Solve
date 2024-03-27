n = int(input())

num = list(map(int, input().split()))
stack1 = []
stack2 = []
result = "Nice"
num.reverse()
while num:
    if len(stack1)+1 == num[-1]:
        stack1.append(num.pop())
    else:
        if not stack2:
            stack2.append(num.pop())
        elif stack2[-1] > num[-1]:
            stack2.append(num.pop())
        elif stack2 and stack1:
            if stack1[-1] + 1 == stack2[-1]:
                stack1.append(stack2.pop())
            else:
                result = "Sad"
                break
        else:
            result = "Sad"
            break
print(result)