fmat = [[1,1],[1,0]]

def matmult(a,b):
    n = len(a)
    c = [[0,0],[0,0]]
    for i in range(n):
        for j in range(n):
            for k in range(n):
                c[i][j] = (c[i][j]+ a[i][k]*b[k][j])%1000000007
    return c

def conqu(b, mat):
    if b == 1:
        return mat
    elif b % 2 == 0:
        mat1 = conqu(b//2, mat)
        return matmult(mat1,mat1)
    elif b % 2 == 1:
        mat1 = conqu(b-1,mat)
        return matmult(mat,mat1)      


n= int(input())

mat1 = conqu(n, fmat)

print(mat1[0][1])
