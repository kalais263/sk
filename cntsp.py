import re
import string
x=str(input(""))
for i in x:
  if i.isnumeric()==0:
    pass
  elif i=='':
    pass
  else:  
    new=re.sub('[\w.]+' ,'' , x)
print(len(new))
