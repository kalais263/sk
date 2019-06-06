n=int(input())
for i in n:
  if(i.isdigit() or i=="."):
    print("yes")
    exit()
  else:
    print("no")
    exit()
