class py_reverse:
    def revr(self,strs):
        sp=strs.split()
        sp.reverse()
        res="".join(sp)
        return res
str1 = input("enter a string with 2 or more words:")
print("Reverse of string word by word:",py_reverse().revr(str1));
