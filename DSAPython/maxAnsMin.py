from math import inf

arr = [3, 1, 4, 2, 5]

srr=sorted(arr)
print (srr)
# Initialize `minV` to positive infinity and `maxV` to negative infinity
minV = float(inf)  # Start with the largest possible number for minimum
maxV = float(-inf)  # Start with the smallest possible number for maximum

# Iterate through the array to find the min and max
for i in arr:
    maxV = max(maxV, i)  # Update maxV if a larger element is found
    minV = min(minV, i)  # Update minV if a smaller element is found

print(f"The value of min is: {minV} and value of max is: {maxV}")