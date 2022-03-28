def maxProduct(a, n):
    maxindex1 = -1
    for i in range(0, n):
        if((maxindex1 == -1) or (a[maxindex1] < a[i])):
            maxindex1 = i
    maxindex2 = -1
    for j in range(0, n):
        if((j != maxindex1) and ((maxindex2 == -1) or (a[maxindex2] < a[j]))):
            maxindex2 = j
    return a[maxindex1] * a[maxindex2]

if __name__ == "__main__":
    n = int(input())
    a = list(map(int, input().split()))
    print(maxProduct(a, n))