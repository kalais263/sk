t1 = input()
h1= t1 //60
t1 %= 60
m1 = t1 // 1
t2=input()
h2=t2//60
t2%=60
m2=t2//1
print("h:m-> %d:%d" % (h1,m1))
print("h:m-> %d:%d" % (h2,m2))
result=h1-h2
resut2=m1-m2
print("Result is h:m-> %d:%d" % (result,resut2))
