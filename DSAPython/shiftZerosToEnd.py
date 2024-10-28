
"""Shift Zeroes to End
Problem Statement: Shift all zeroes to the end.
Input: [0, 1, 0, 3, 12]
Expected Result: [1, 3, 12, 0, 0]"""
#1,0,0,3,12
arr=[1,0,0,3,12]

i=0
j=0

while j<len(arr):
    if arr[j]!=0:
        arr[i],arr[j]=arr[j],arr[i]
        i+=1
    j+=1
print(arr)


