n=int(input())
a=list(map(int,input().split()))
t=[]
for i in a:
  t.append(i)
  t.sort()
print(min(t), max(t))
  
