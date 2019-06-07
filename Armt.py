a,b=list(map(int,input().split()))
for num in range(a+1,b):
 sum=0
 temp=num
 while temp>0:
  d=temp%10
  sum+=d**3
  temp//=10 
 if(num==sum):
  print(num)
