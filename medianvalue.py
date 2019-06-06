n=int(input())
a=list(map(int,input().split()))
b=len(a)//2
a.sort()
print(a[b])
