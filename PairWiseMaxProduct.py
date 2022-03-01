n = int(input())
a = list(map(int, input().split()))

def maxProduct(a, n):
    result = 0
    maxindex1 = -1
    for i in range(0, n):
        if((maxindex1 == -1) or (a[maxindex1] > a[i])):
            maxindex1 = i
    maxindex2 = -1
    for j in range(0, n):
        if((a[j] != a[maxindex1]) and ((maxindex2 == -1) or (a[maxindex2] > a[j]))):
            maxindex2 = j
    return a[maxindex1] * a[maxindex2]

print(maxProduct(a, n))