tc = int(input())

for TC in range(1, tc+1):
    st = list(input())

    H = int(input())

    H_l = list(map(int, input().split()))

    H_l.sort(reverse=True)
    for i in H_l:
        st.insert(i, '-')

    print("#%d"%TC, end = ' ')
    for i in st:
        print(i, end = '')

    print()
        
