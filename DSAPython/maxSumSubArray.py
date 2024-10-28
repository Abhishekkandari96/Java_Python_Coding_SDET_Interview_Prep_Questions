"""Maximum Sum Subarray (Kadane’s Algorithm)
Problem Statement: Find the maximum sum of a contiguous subarray.
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Expected Result: 6"""
arr=[-2, 1, -3, 4, -1, 2, 1, -5, 4]

cs=arr[0]
ms=0

for i in range(1,len(arr)):
    cs = max(arr[i],cs+arr[i]) 
    ms=max(ms,cs)
    
print(ms)
    
