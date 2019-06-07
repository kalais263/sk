def permutation(lst): 
    if len(lst) == 0: 
        return []  
    if len(lst) == 1: 
        return [lst] 
    l = []  
    for i in range(len(lst)): 
       m = lst[i]  
       remLst = lst[:i] + lst[i+1:] 
       for p in permutation(remLst): 
           l.append([m] + p) 
    return l 
str=input()
data = list(str) 
for p in permutation(data): 
    print(*p,sep="") 
