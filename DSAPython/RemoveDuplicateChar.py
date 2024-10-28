"""Remove Duplicate Characters
Problem Statement: Remove duplicate characters from the string.
Input: "banana"
Expected Result: "ban"""

Input= "abccsdda"

dict={}

for ch in Input:
    dict[ch]=dict.get(ch,0)+1

print (dict)
count=0
result=""
for ch in dict.keys():
    result=result+ch
    
print (result) 

srr=sorted(dict.values())
print (srr)
        
        
        
        
    


