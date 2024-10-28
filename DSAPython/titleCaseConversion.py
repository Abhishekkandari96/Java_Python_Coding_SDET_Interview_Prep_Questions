"""Title Case Conversion
Problem Statement: Convert the string to title case.
Input: "hello world"
Expected Result: "Hello World"""


input="hello world"

arr=input.split( " ")

for i,ch in enumerate(arr):
    arr[i]=ch.capitalize()
    
print(" ".join(arr))