""""Rotate Array Left by K Positions
Problem Statement: Rotate the array left by K positions.
Input: [1, 2, 3, 4, 5], K = 2
Expected Result: [3, 4, 5, 1, 2]"""



arr = [1, 2, 3, 4, 5]
k = 2%len(arr)

# Rotate left by k positions
rotated_arr = arr[k:] + arr[:k]
print(rotated_arr)  # Output: [3, 4, 5, 1, 2]



