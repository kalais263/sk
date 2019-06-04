n=int(input())
e=list(map(int,input().split()))
e=sorted(e)
e=e[::-1]
b=""
for i in e:
  b=b+str(i)
print(int(b))
