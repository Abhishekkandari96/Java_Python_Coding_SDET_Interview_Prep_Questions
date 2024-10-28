"""Rearrange Array with Negative Numbers First
Problem Statement: Rearrange the array such that negative numbers come before positive numbers.
Input: [1, -2, 3, -4, 5]
Expected Result: [-2, -4, 1, 3, 5]

"""
arr=[1,-2,3,-4,5]

i=0
for j in range(len(arr)):
    if arr[j]<0:
        arr[i],arr[j]=arr[j],arr[i]
        i+=1
        
print (arr)