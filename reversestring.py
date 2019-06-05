myString=raw_input(" ")
words=myString.split(" ")
newWords=[word[::-1] for word in words]
newString=" ".join(newWords)
print(newString)
