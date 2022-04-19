def gcd(a, b):
    if(b == 0):
        return a
    aComp = a%b
    return gcd(b,aComp)

if __name__ == "__main__":
    a, b = map(int, input().split())
    print(gcd(a, b))
