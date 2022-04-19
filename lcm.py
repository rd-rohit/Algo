def gcd(a, b):
    if(b == 0):
        return a
    aComp = a%b
    return gcd(b,aComp)

def lcm(a, b):
    return (a/gcd(a,b))*b

if __name__ == "__main__":
    a, b = map(int, input().split())
    print(int(lcm(a, b)))
