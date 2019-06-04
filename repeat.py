n=int(input())
l=list(map(int,input.split()))
a=[]
for i in l:
  if l.count(i)>1:
    a.append(i)
x=set(a)
if len(x)==0:
  print("uniqe")
else:
  print(*x)
