from string import ascii_lowercase as asc_lower
def check(s):
    return set(asc_lower) - set(s.lower()) == set([])
string=input("Enter string:")
if(check(string)==True):
      print("yes")
else:
      print("no")
