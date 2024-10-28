"""Anagram Check
Problem Statement: Check if two strings are anagrams.
Input: "listen", "silent"
Expected Result: True"""

str1="listen"
str2="silent"

dict1={}
dict2={}

for ch in  str1:
    dict1[ch]=dict1.get(ch,0)+1
    
for ch in str2:
    dict2[ch]= dict2.get(ch,0)+1
    
print(dict1==dict2)

