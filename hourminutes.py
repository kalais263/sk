n=int(input())
h=0
while(n>60):
  min=n-60
  h=h+1
  if(min>60):
    n=min
  else:
    break
if(n>60):
  print(h,min)
else:
  print(h,n)