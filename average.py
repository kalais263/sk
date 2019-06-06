n=int(input())
a=list(map(int,input().split()))
t=[]
sum=0
for i in a:
  t.append(i)
for num in t:
  sum+=num
print(sum//n)
