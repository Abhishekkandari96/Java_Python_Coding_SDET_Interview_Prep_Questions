"""Find All Subarrays with Given Sum
Problem Statement: Find all the subarrays that sum up to a given value.
Input: [1, 2, 3, 4, 5], Sum = 5
Expected Result: [(2, 3), (5)]
"""

arr=[1, 2, 3, 4, 5]
expec=5
rsum=0
j=0
for i in range(0,len(arr)):
    rsum=rsum+arr[i]
    while rsum>=expec:
        if rsum==expec:
            print(arr[j:i+1])
        rsum-=arr[j]
        j+=1
        



        