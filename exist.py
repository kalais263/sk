n,k=list(map(int,input().split()))
a=list(map(int,input().split()))
t=[]
for i in a:
  t.append(i)
if k in t:
  print("yes")
else:
  print("no")
