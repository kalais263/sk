n=int(input())
l=list(map(int,input().split()))
a=[]
c=0
for i in range(n):
    if i==l[i]:
        c+=1
        a.append(l[i])
if c!=0:
    print(*sorted(a))
else:
    print(-1)
