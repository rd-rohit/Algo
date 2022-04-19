# Uses python3
def calc_fib(n):
    F = []
    F.insert(0,0)
    F.insert(1,1)
    if (n <= 1):
        return n
    for i in range(2,n+1):
        F.insert(i,F[i-1] + F[i-2])

    return F[n]

n = int(input())
print(calc_fib(n))
