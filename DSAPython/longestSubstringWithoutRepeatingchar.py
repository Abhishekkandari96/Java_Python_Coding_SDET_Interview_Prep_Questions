"""Longest Substring Without Repeating Characters
Problem Statement: Find the length of the longest substring without repeating characters.
Input: "abcabcbb"
Expected Result: 3 """

str="abcabbb"
map={}

j=0
ans=float('-inf')
for i in range (0,len(str)):
    map[str[i]]=map.get(str[i],0)+1
    
    while map[str[i]]>1:
        map[str[j]]=map.get(str[j])-1
        j+=1
    
    ans=max(ans,i-j)
print(ans)
    
        
        
        


