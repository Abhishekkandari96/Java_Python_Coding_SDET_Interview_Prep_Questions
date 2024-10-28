"""Check for Sorted Array
Problem Statement: Check if the array is sorted in ascending order.
Input: [1, 2, 3, 4, 5]
Expected Result: True"""


arr=[1, 2, 3, 4, 5]

flag=True
for i in range(1,len(arr)):
    if arr[i-1]>arr[i]:
        flag=False
        
print(flag)