import string
"""Check Palindrome
Problem Statement: Check if the given string is a palindrome.
Input: "racecar"
Expected Result: True"""

str="racecar"
strList=list(str)
length=len(strList)-1
start=0
end=length
flag=True

while start<=end:
    if strList[start]!=strList[end]:
        flag=False
    start+=1
    end-=1
    
    

print(flag)
        

