"""String Compression
Problem Statement: Compress the string by counting consecutive characters.
Input: "aaabbcc"
Expected Result: "a3b2c2"""

input="aaabbcc"
map={}

for i in range(len(input)):
    map[input[i]]=map.get(input[i],0)+1

result=""
for ch in map.keys():
    result=result+ch+str(map.get(ch))
    
print(result)