"""First Non-Repeating Character
Problem Statement: Find the first non-repeating character.
Input: "aabcc"
Expected Result: "b"""


str="aabcc"

dict={}
str2=""
for ch in str:
    dict[ch]=dict.get(ch,0)+1;
    
for ch in str:
    if dict[ch]==1:
        str2=ch
        break

print(ch)

