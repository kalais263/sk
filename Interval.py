n,b=list(map(int,input().split()))
for a in range(n+1,b):
 k=0
 for i in range(2,a//2+1):
  if(a%i==0):
   k=k+1
 if(k<=0):
  print(a,end=" ")
                 
